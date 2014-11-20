package org.java.training;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Try This 4-2. Demonstrates Java finalizers, with the added bonus
 * of the lesser known Java reference types. Selectable as some interfere with each
 * other if run in sequence.
 */
public class Finalize {
	enum RefType { STANDARD, WEAK, SOFT, PHANTOM }

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		RefType t = selectRefTypeForDemonstration();
		
		switch(t) {
		case STANDARD: {
			overalloc( Simple::new );
			break;
		}
		
		case WEAK: {
			// Weak references will typically be cleaned up on garbage collection:
			new RefChecker<>( WeakReference<Simple>::new, new Simple() ).verify();
			break;
		}
		
		case SOFT: {
			// Soft references will only be cleaned up if resources are low:
			RefChecker<Simple, SoftReference<Simple>> ref = new RefChecker<>( SoftReference<Simple>::new, new Simple() );

			/* So fill up memory to try and trigger cleanup (chances are it'll remain):
			 * Tweak the loop parameter on your system so that it just _doesn't_ OutOfMemoryError on you.
			 */
			{ for( int i = 100; i > 0; --i ) largeList( () -> new Long(5L) ); }
			ref.verify();
			break;
		}
		
		case PHANTOM: {
			// Phantom refs to execute callback on GC of set of objects:
			PostMortem<Integer, String> post = new PostMortem<>( largeList( () -> new Integer("5") ), () -> "All instances destroyed." );
			System.out.println( post.get(10_000) );
			break;
		}

		default:
		}
	}
	
	public static <T> void overalloc( Supplier<T> malloc ) {
		Stream.iterate(1, i -> ++i).limit(1_000_000).forEach( i -> malloc.get() );
	}
	
	public static <T> List<T> largeList( Supplier<T> malloc ) {
		return Stream.iterate(1, i -> ++i).limit(1_000_000)
				.map( i -> malloc.get() )
				.collect(Collectors.toList());
	}
	
	public static RefType selectRefTypeForDemonstration() {
		try( Scanner in = new Scanner(System.in) ) {
			do {
				System.out.print("Select reference type to GC test (standard|weak|soft|phantom): ");
				try {
					return RefType.valueOf( in.nextLine().trim().toUpperCase() );
				} catch ( Exception e ) { System.out.println("That's not a reference type. Try harder."); }
			} while( true );
		}
	}
	
}

class Simple {
	private static int id = 0;
	final int x;
	
	public Simple() {
		this.x = ++id;
	}
	
	@Override
	protected void finalize() {
		System.out.printf("[%s.%d] destroyed%n", getClass().getSimpleName(), x);
	}
}

/**
 * Simple GC verifier for references.
 */
class RefChecker<T, R extends Reference<T>> {
	private final R ref;
	
	public RefChecker( Function<T, R> wrapper, T type ) {
		ref = wrapper.apply(type);
	}
	public void verify() {
		System.gc();
		T type = ref.get();
		System.out.printf( "Instance %s get garbage collected.%n", type == null ? "did" : "did not" );
	}
}

/**
 * Performs a callback on GC of all objects in a collection.
 */
class PostMortem<T, R> {
	private final List<PhantomReference<T>> refs = new LinkedList<>();
	private final Supplier<R> callback;
	
	public PostMortem( Iterable<T> active, Supplier<R> onDestroy ) {
		ReferenceQueue<T> queue = new ReferenceQueue<>();
		active.forEach(t -> refs.add( new PhantomReference<T>(t, queue) ) );
		this.callback = onDestroy;
	}
	
	public R get( long timeout ) throws TimeoutException, InterruptedException {
		System.gc();
		for(long sz = refs.size(), stime = System.currentTimeMillis();
			refs.stream().anyMatch(r -> !r.isEnqueued());
			Thread.yield() ) {

			System.out.printf( "[%8d/%-8d] instances collected%n",
				refs.stream().filter(r -> r.isEnqueued()).count(), sz );

			if ( System.currentTimeMillis() - stime > timeout )
				throw new TimeoutException();
		}
		return callback.get();
	}
}
