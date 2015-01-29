1) Multithreading allows unused CPU cycles to be spent on other processing while the current process is waiting.

2) Multithreading is supported by the `Thread` class and the `Runnable` interface.

3) You would want to extend from `Thread` when you want to override the methods in `Thread` besides `run()`.

4)
```java
try {
	MyThrd.join()
	\\ Do something after the thread is finished
} catch ( InterruptedException ie ) {
	\\ Some handling
}
```
5)
```java
MyThrd.setPriority( Thread.NORM_PRIORITY + 3 );
```

6) Using `synchronized` on a method means that only one thread can call that method at a time. Another thread can only start using the method when it is returned by the first thread. 

7) `wait()` and `notify()` are used to perform cross-thread communication.

8) See Question8.java

9)`suspend()`, `stop()` and `resume()` cannot be used because they have the potential to cause deadlock in a program.

10) `getName()`

11) `isAlive()` returns `true if the thread is running and `false` otherwise.

12) See Question12.java
