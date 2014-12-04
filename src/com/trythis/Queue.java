package com.trythis;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Queue<T> implements Iterable<T> {
    private List<T> queue;
    
    public Queue() {
        this.queue = new ArrayList<T>();
    }
    
    public <R extends T> Queue( Queue<R> other ) {
        this.queue = new ArrayList<T>();
        this.queue.addAll( other.queue );
    }

    public Queue( T[] values ) {
        this.queue = new ArrayList<T>();
        Arrays.stream( values ).forEach( t -> this.queue.add( t ) );
    }
    
    @Override
    public Iterator<T> iterator() {
        return queue.iterator();
    }
    
    public Stream<T> stream() {
        return StreamSupport.stream( this.spliterator(), false );
    }
    
    public Queue<T> put( T value ) {
        this.queue.add( value );
        return this;
    }
    
    public T get() throws BufferUnderflowException {
        if ( isEmpty() )
            throw new BufferUnderflowException(  );
        
        return this.queue.remove( 0 );
    }
        
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
    public static void main( String[] args ) {
        Queue<Character> q = new Queue<Character>();
        "abcdefgh".chars()
                  .mapToObj( i -> (char)i ).forEach( q::put );
                
        Queue<Character> newQ = new Queue<Character>( q );
        Queue<Character> anotherQ = new Queue<Character>( new Character[] { 'w', 'x', 'y', 'z' } );            
        try { 
            System.out.printf("Queue: %s%n", q.stream().map( c -> c.toString() ).collect( Collectors.joining("," ) ) );
            System.out.printf("Copy : %s%n", newQ.stream().map( c -> c.toString() ).collect( Collectors.joining("," ) ) );
            System.out.printf("Array: %s%n", anotherQ.stream().map( c -> c.toString() ).collect( Collectors.joining("," ) ) );
            
            // try to read an empty queue.
            while( !q.isEmpty() ) q.get();
            q.get();
            
        } catch ( BufferUnderflowException e ) {
            System.out.println( "Error: The queue is empty." );
        }
    } 
}
