# Chapter 8 Answers

### 1. Using the code from trythis 8.1 put the `ICharQ` interface and its three implementations into a package called `qpack`. Keeping the queue demonstration class `IQDemo` in the default package, show how to import and use the classes in qpack.

[CircularQueue](src/main/java/qpack/CircularQueue.java), [DynQueue](src/main/java/qpack/DynQueue.java) and [FixedQueue](src/main/java/qpack/FixedQueue.java) need to change their class modifiers to `public`.

[IQDemo](src/main/java/IQDemo.java) now needs to import the packages.

### 2. What is a namespace? Why is it important that java allows you to partition the namespace?

The namespace is where all the names of the classes, methods and variables are held. Java uses this to work out which class/method/variable you are trying to reference.

This is important as if every class had to be unique, class names would start to become unreadable as all the readable names would be taken up quickly.

### 3. Packages are stored in \_\_\_\_\_\_\_

Directories

### 4. Explain the difference between `protected` and default access.

`protected` access allows access at package level and to all subclasses.

default access only grants access at package level.

### 5. Explain the two ways that the members of a package can be used by other packages.

You can either import the available members at the top of a class:
```java
import blarg.Honk;
```
or you can reference them directly when using them:
```java
...
String message = blarg.Honk.getMessage();
...
```

### 6. "One interface, multiple methods" is a key tenant of java. What feature best exemplifies it?

apparently the answer is looking for "interfaces"...

### 7. How many classes can implement an interface? How many interfaces can a class implement? 

An interface can be `implement`ed by any number of classes.

A class can `implement` any number of interfaces.

### 8. Can interfaces be `extended`

Yes, by other interfaces.

### 9. Create an interface for the vehicle class from chapter 7. Call the interface `IVehicle`.

[No.](src/main/java/vehicle/IVehicle.java)

### 10. Variables declared in an interface are implicitly static and final. Can they be shared with other parts of a program?

Yes as they are implicitly public.

### 11. A package is, in essence, a container for classes. True or False?

True.

### 12. What standard Java package is automatically imported into a program?

java.lang

### 13. What keyword is used to declare a default `interface` method?

To declare a `default` interface method you must use the `default`keyword.

### 14. Beginning with JDK 8, is it possible to define a `static` method in an `interface`?

Yes

### 15. Assume that `ICharQ` interface shown in Try This 8-1 has been in widespread use for several years. Now, you want to add a method to it called `reset()`, which will be used to reset the queue to its empty, starting condition. Assuming JDK 8 or later, how can this be accomplished without breaking preexisting code?

Adding a `default` method to the ICharQ interface will allow the new method to be added to all inheriting classes, without needing to go through all the classes and add an implementation manually.

### 16. How is a static method in an interface called.

It is not inherited by the implementing classes, so the static method will need to be called through the interface:

```java
Interface.method
```