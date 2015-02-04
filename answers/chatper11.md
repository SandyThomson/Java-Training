### Chapter 11 Self Test

1) _How does Java's multithreading capability enable you to write more efficient programs?_

By allowing sections of code to be run in parallel where possible.

2) _Multithreading is supported by the            class and the               interface._

`Thread` and `Runnable`

3) _When creating a runnable object, why might you want to extend **Thread** rather than implement **Runnable**?_

When you want to override more than just run

4) _Show how to use **join()** to wait for a thread object called **MyThrd** to end._

`MyThrd.join();`

5) _Show how to set a thread called **MyThrd** to three levels above normal priority._

`MyThrd.setPriority(Thread.NORMAL_PRIORITY+3);`

6) _What is the effect of adding the **synchronized** keyword to a method?_

It prevents multiple threads from accessing the method at the same time.

7) _The **wait()** and **notify()** methods are used to perform                ._

Inter-thread communication

8) _Change the **TickTock** class so that it actually keeps time. That is, have each tick take one half second, and each tock take on half second. Thus, each tick-tock will take one second. (Don't worry about the time it takes to switch tasks, etc.)_

[TickTock](../src/chapter11/TickTock.java)

9) _Why can't you use **suspend()**, **resume()**, and **stop()** for new programs?_

These have all been deprecated as they can cause serious runtime problems.

10) _What method defined by **Thread** obtains the name of a thread?_

`getName()`

11) _What does **isAlive()** return?_

**true** if thread is still running, otherwise **false**

12) _On your own, try adding synchronisation to the Queue class developed in previous chapters so that it is safe for multithreaded use._

Skipped since I can't find Queue!
