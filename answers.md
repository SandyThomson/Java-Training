# Chapter 11

** 1. How does Java’s multithreading capability enable you to write more efficient programs?**

By allowing multiple streams of execution to run concurrently or psuedo-concurrently

**2. Multithreading is supported by the _________ class and the ________ interface.**

`Thread` class and the `Runnable` interface.

**3. When creating a runnable object, why might you want to extend Thread rather than implement Runnable?**

Because you want to inherit or override the methods of `Thread` rather than just implement `run()`

**4. Show how to use join( ) to wait for a thread object called MyThrd to end.**

`MyThrd.join();`

**5. Show how to set a thread called MyThrd to three levels above normal priority.**

`MyThrd.setPriority( Thread.NORM_PRIORITY + 3 );`

**6. What is the effect of adding the synchronized keyword to a method?**

It ensures that only one thread can execute the method at any one time.

**7. The wait( ) and notify( ) methods are used to perform _______________________.**

Communication between different threads.

**8. Change the TickTock class so that it actually keeps time. That is, have each tick take one half second, and each tock take one half second. Thus, each tick-tock will take one second. (Don’t worry about the time it takes to switch tasks, etc.)**

See `TickTock`

**9. Why can’t you use suspend( ), resume( ), and stop( ) for new programs?**

They're deprecated methods which can cause problems.

**10. What method defined by Thread obtains the name of a thread?**

`getName()`

**11. What does isAlive( ) return?**

boolean

**12. On your own, try adding synchronization to the Queue class developed in previous chapters so that it is safe for multithreaded use.**


