### Chapter 11 Self Test Answers

1) 
	
	It allows tasks to be run in parallel thus utilising multiple CPU cores or spare clock cycles on a single CPU. 

2)

	Thread , Runnable
	
3)

	If you want to override any of the standard Thread methods.
	
4)

```java
MyThrd.join();
```
	
5)

```java
MyThrd.setPriority(Thread.NORM_PRIORITY+3);
```	
	
6)

	Adding synchronised means that the method will be thread safe i.e if the method is being called by a thread it will be locked to all other threads.
	
7)

	synchronisation
	
8)

See [TickTockDemo.java](TicTockDemo.java)

9)

	they have been depricated as they can cause programs to hang under certain conditions.
	
10)

	getName
	
11)

	returns 1 if the thread is active and 0 if it is not.
	
12)
	
See [QueueDemo.java](QueueDemo.java)
