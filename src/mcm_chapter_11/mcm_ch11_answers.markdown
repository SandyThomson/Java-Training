# MCM Chapter11 Answers

** 1. How does Java’s multithreading capability enable you to write more efficient programs?**

Java's multithreading capability enables us to write more efficent programs by allowing functionality within a thread to be run concurrently, meaning that while one task is running, another can also be running side by side. This allows for more efficient, and more responsive code. Efficiency depends on the hardware available, number of CPUs, and the way that the OS handles multitasking.

**2. Multithreading is supported by the _________ class and the ________ interface.**

Thread class and Runnable interface.

**3. When creating a runnable object, why might you want to extend Thread rather than implement Runnable?**

You may want to extend the Thread class to override some of its methods, although the only ne that you usually need to extend is the run() method. The preferred approach is normally to implement runnable, as this allows the class to extend other classes, bearing in mind that Java only allows objects to extend a single class, but implement many interfaces. Implementing runnable gives more flexibility unless there is a special reason to extend some of the Thread's class behaviour.

**4. Show how to use join( ) to wait for a thread object called MyThrd to end.**

```java
	try {
	  mt1.thrd.join();
	  System.out.println("Child #1 joined.");
	  mt2.thrd.join();
	  System.out.println("Child #2 joined.");
	  mt3.thrd.join();
	  System.out.println("Child #3 joined.");
	}
	catch(InterruptedException exc) {
		
	}
```


**5. Show how to set a thread called MyThrd to three levels above normal priority.**

```java
	MyThrd myThrd = new MyThrd();
	myThrd.setPriority(Thread.NORM_PRIORITY+2);
```

**6. What is the effect of adding the synchronized keyword to a method?**

Adding the synchronised keyword to a method means that it is effectively locked when being accessed by a thread, so that other threads need to wait until the thread using it finishes with it.


**7. The wait( ) and notify( ) methods are used to perform _______________________.**

Thread communication.


**8. Change the TickTock class so that it actually keeps time. That is, have each tick take one half second, and each tock take one half second. Thus, each tick-tock will take one second. (Don’t worry about the time it takes to switch tasks, etc.)**


**9. Why can’t you use suspend( ), resume( ), and stop( ) for new programs?**

Because they have been deprecated as of Java 2, since they are well dodgy and cause bad things to happen. The behaviour can be achieved using booleans and checking thread status. 


**10. What method defined by Thread obtains the name of a thread?**

getName()


**11. What does isAlive( ) return?**

The isAlive() method returns a boolean indicating whether or not a thread is running, this can be used to wait until its done.


**12. On your own, try adding synchronization to the Queue class developed in previous chapters so that it is safe for multithreaded use.**

See [ThreadSafeQueueDemo.java](ThreadSafeQueueDemo.java)

