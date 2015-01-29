#### Chapter 11 SelfTest Answers

1)  _Multithreading_ allows you to write more efficient programs by allowing two or more tasks to be performed at the same time. This allows you to utilize the idle time that is present in more programs.  

2)  **Thread** class and **Runnable** interface.

3)  You would extend the **Thread** class when you want to override the default behaviour provided in the **Thread** class and it's methods.

4)  
```java
  MyThrd.join();
```

5)
```java
  MyThrd.setPriority( Thread.NORM_PRIORITY + 3 );
```

6)  The effect is that the method will only be able to be executed by one thread at a time for a given object of that class type.  When the method is called the calling thread will enter the object's monitor which locks the method which prevents any other thread entering the method or any other _synchronized_ method defined by the class.

7)  Thread communication.  

8)  See [Clock.java](src/com/selftest/Clock.java)

9)  These methods are _deprecated_.

10)  **getName()**.

11)  A **boolean**.  Specifically, it will return **true** if the thread is alive (e.g. thread is still running) and **false** if not (e.g. thread has terminated).  

12)  See [QueueDemo.java](src/com/selftest/QueueDemo.java)