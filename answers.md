### Chapter 11 Self Test

  1) _How does Java's multithreading capability enable you to write
      more efficient programs?_

It allows you to perform operations concurrently, rather than serially,
potentially across multiple cores, and will often boost single core execution
by giving the processor something to do while a thread is blocked on slow I/O.

It should be noted that multithreading will not always increase, and may
reduce efficiency due to the overhead of context switching (potentially
flushing CPU cache lines), or excessive synchronisation.

  2) _Multithreading is supported by the _____ _class and the _____ _interface._

`Thread` class; `Runnable` interface.

  3) _When creating a runnable object, why might you want to extend `Thread` rather
      than implement `Runnable`?_

If you needed to override methods of the `Thread` class, or were maintaining ownership
over the thread's execution.

  4) _Show how to use `join()` to wait for a thread object called `MyThrd` to end._

```java
Thread t = new MyThrd();
t.start();
t.join();
```

  5) _Show how to set a thread called `MyThrd` to three levels above normal
      priority._

```java
new MyThrd().setPriority(Thread.NORM_PRIORITY + 3);
```

  6) _What is the effect of adding the `synchronized` keyword to a method?_

For an instance method, it will lock access to any `synchronized` methods
on the instance to other threads (it's the equivalent of having `synchronized(this) { }`).
For static methods, it will lock access to any synchronised static methods (the equivalent
of `synchronized(MyType.class) {}`.

  7) _The `wait()` and `notify()` methods are used to perform _______.

Thread communication.

  8) _Change the `TickTock` class so that it actually keeps time. That is,
      have each tick take one half second, and each tock take one half second.
      Thus, each tick-tock will take one second. (Don't worry about the time
      it takes to switch tasks, etc.)_

See [TickTock.java](src/org/java/training/TickTock.java).

  9) _Why can't you use `suspend()`, `resume()`, and `stop()` for new programs?_

They're not safe. If another thread is waiting on a lock owned by the thread to
be suspended/stopped, it could result in deadlock.

 10) _What method defined by `Thread` obtains the name of a thread?_

`getName()`.

 11) _What does `isAlive()` return?_

A boolean determining whether the thread is active (that is, started and not complete,
the thread doesn't need to be in context to be active).

 12) _On your own, try adding synchronization to the `Queue` class developed in
      previous chapters so that it is safe for multithreaded use._

On my own? Who had I been answering the other questions with!?

Anyway, [SynchQueueDemo.java](src/org/java/training/SynchQueueDemo.java).
