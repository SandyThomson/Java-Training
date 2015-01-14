# mssw Chapter 9 Answers

## 1. What class is at the top of the exception hierarchy?

`Throwable`

## 2. Briefly explain how to use try and catch

You would wrap a `try` block around some code that you would expect to throw an exception.

After the `try` block you would add a `catch` block to stop any specified exceptions halting the execution of your program. 

## 3. What is wrong with this fragment?

```java
// ...
vals[18] = 10;
catch (ArrayIndexOutOfBoundsException exc) {
	// handle error
} 
```

The comment is stating that it is handling an error, when in fact it is handling an exception.

Also there is no `try` block around the assignment to `vals`. A `catch` block must always have a `try` block, and visa versa.

## 4. What happens if an exception is not caught?

It will be caught by the JVM, who's default exception handling technique is to halt execution and print a stack trace.

## 5. What is wrong with this fragment?

```java
class A extends Exception { 
	// ...
}

class B extends A {
	// ...
}

// ...

try {

	// ...
}
catch (A exc) {
	// ...
}
catch (B exc) {
	// ...
}
```

Class `A` is being caught first. This is a superclass of `B` so if a `B` was thrown it would be picked up in the `catch` block for `A`. This means that the code in the `B` `catch` block is unreachable, meaning that a compile time error would occurr.

## 6. Can an inner catch rethrow an exception to an outer catch?

I don't see why not.

## 7. The finally block is the last bit of code executed before your program ends. True or False?

False - it is the last bit of code executed after leaving a try/catch block, whether an exception was caught, not caught, re-thrown or execution completed un-exceptionally.

## 8. What type of exceptions must be explicitly declared in a throws clause of a method?

Those that are not subclasses of `Error` or `RuntimeException`, although I do not remember reading any mention of `RuntimeException`s...

## 9. What is wrong with this fragment?

```java
class MyClass { // ... }
// ...
throw new MyClass();
```

A line comment was used in the first `// ...` meaning that the class `MyClass` does not have a closing bracket.

Also `MyClass` does not extend `Throwable` so you cannot `throw` it.

## 10. In question 3 of Chapter 6 Self Test, you created a Stack class. Add custom exceptions to your class that report stack full and stack empty conditions.

[StackMyExceptionUp.java](src/main/java/StackMyExceptionUp.java)

## 11. What are the three ways that an exception can be generated?

  * An error in the JVM
  * An issue with your program
  * By `throw`ing explicitly

## 12. What are the two direct subclasses of Throwable?

`Exception` and `Error`

## 13. What is the multi-catch feature?

Being able to catch multiple types of exceptions in a single catch clause by separating the types with the `|` separator.

## 14. Should your code typically catch exceptions of type Error?

`No`