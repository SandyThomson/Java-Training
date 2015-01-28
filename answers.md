# Chapter 11 Answers - mssw

## 1. How does Java's multithreading capability enable you to write more efficient programs?

By allowing more than one process of execution to occurr simultaneously, you can create faster, more responsive programs.

## 2. Multithreading is supported by the \_\_\_\_\_\_\_\_ class and the \_\_\_\_\_\_\_\_ interface.

*Thread* class and the *Runnable* interface.

## 3. When creating a runnable object, why might you want to extend **Thread** rather than implement **Runnable**?

Because there is less code to write:

```java
Thread t = new CustomThread();
t.start();
```

Compared to:

```java
Runnable r = new CustomRunnable();
Thread t = new Thread(r);
t.start();
```

## 4. Show how to use the join() to wait for a thread object called MyThrd to end.

```java
Thread MyThrd = new CustomThread();
MyThrd.start();
MyThrd.join();
```

## 5. Show how to set a thread called MyThrd to three levels above normal priority.

```java
Thread MyThrd = new CustomThread();
MyThrd.start();
MyThrd.setPriority(MyThrd.getPriority() + 3);
```

## 6. What is the effect of adding the synchronized keyword to a method?

It will cause any threads trying to call that method to wait until no other threads are calling it. 

## 7. The **wait()** and **notify()** methods are used to perform \_\_\_\_\_\_\_\_\_\_\_\_.

perform *inter process communication*.

## 8. Change the *TickTock* class so that it actually keeps time. That is have each tick take one half second, and each other tock take one half second. Thus, each tick-tock will take one second. (Dont worry about the time it takes to switch tasks.

[ThreadCom](src/main/java/ThreadCom.java)

## 9. Why can't you use **suspend()**, **resume()** and **stop()** for new programs?

A). They do bad things apparently...

B). Why do you keep going on about them! Now all i'm going to remember about the Thread class is these three methods!!

## 10. What method defined by **Thread** obtains the name of a thread?

I'm going to guess something like `getName()`. 

## 11. What does **isAlive()** return?

A boolean.

## 12. On your own, try adding synchronization to the **Queue** class developed in previous chapters so that it is safe for multithreaded use. 

[SynchronizedQueue](src/main/java/SynchronizedQueue.java)
