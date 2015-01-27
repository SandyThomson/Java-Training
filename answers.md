1) Multithreading allows tasks within a program to be performed simultaneously.

2) Multithreading is supported by the _Thread_ class and the _Runnable_ interface.

3) ``Thread`` provides a number of methods for thread management, while ``Runnable`` only
defines that the the ``run()`` method must be implemented.

4)
```java
try {
	MyThrd.join()
} catch ( InterruptedException e ) {
	// do something with e
}
```

5)
```java
MyThrd.setPriority( NORM_PRIORITY + 3 );
```

6) ``synchronised`` adds locking to a method, meaning that while it is in use by one thread, others
must wait for its completion.

7) The ``wait()`` and ``notify()`` methods are used to perform _thread communication_.

8) See TickTock.java

9) These methods were deprecated as they could produce deadlocked threads.

10) ``getName()``

11) ``isAlive()`` returns ``true`` if a thread is still running, and ``false`` otherwise. 

12) See Stack.java