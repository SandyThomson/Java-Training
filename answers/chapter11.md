  1. Multithreading allows you to partition programs into work units/threads which can run in parallel. 
  This can make your program more efficient on a multi processor system, or when a thread is waiting for resources etc (another thread can run in that time). 
  
  2. Multithreading is supported by the Thread class and the Runnable interface
  
  3. You would extend Thread if you wanted to override a method of thread _other than_ `run()` 
  
  4. Erm? Surely the object would be called `myThread`? Shrug:
  
  ```java
  MyThrd.join()`;
  ```
  
  5. ```java
  thread.setPriority(Thread.NORM_PRIORITY+3);
  ```
  
  6. A synchronized method only allows one thread to access that method _or any other synchronized method in the same class_. 
  
  7. The wait() and notify() methods are used to perform thread communication.
  
  8. Achieved by a couple of Thread.sleep(500); calls. See code examples.
  
  9. suspend(), resume() and stop() can cause serious problems such as deadlock, so were deprecated in Java 2.
  
  10. Erm ...
  ```java
  thread.getName();
  ```
  
  11. isAlive(); returns a boolean value indicating whether a thread is still running. 
  
  12. See FixedQueue.java, but really you just whack a synchronized keyword onto each of the push() / pop() methods, right?