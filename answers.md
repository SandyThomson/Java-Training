#### Chapter 8 Self Test

1) See [QueueDemo.java](src/com/selftest/QueueDemo.java)

2) A namespace is a _declarative_ _region_ in which class names are allocated.  Within the same namespace, no two classes can have the same name however, by using packages to partition the namespace, naming collisions can be avoided.

3)  Packages are stored in directories within the file system.

4)  A class member with **protected** access can be accessed within it's package and by any _subclass_ outside of it's package.  However, a class member with **default** access can only be accessed within it's package.

5)  You can use the full name of the package member. E.g.
```java
com.selftest.Queue<String> fixedQueue = new com.selftest.FixedQueue<String>( 10 );
```
 
Or, alternatively, you can use the **import** keyword. E.g.
```java
import com.selftest.Queue;
import com.selftest.FixedQueue;
```

or 
```java
import com.selftest.*
```

and then use just the _classname_ when using the member. E.g.
```java
Queue<String> fixedQueue = new FixedQueue<String>( 10 );
```

 6) The use of an _interface_ to define the methods which implementing subclasses **need** to provide (or _optionally_ can provide in the case of **default** methods).
 
 7) There is no limit how many classes can implement a particular _interface_ or how many _interfaces_ a class can implement.
 
 8) Yes using the **extends** keyword.
 
 9) See [IVehicle.java](src/com/selftest/Vehicle/IVehicle.java)
 
 10) Yes because they are also implicitly **public**.
 
 11) True.
 
 12) **java.lang**.
 
 13) **default**.
 
 14) See [Queue.java](src/com/selftest/qpack/Queue.java)
 
 15) A **static** method is called by using the form:
 ```java
 MyInterface.method();
 ```