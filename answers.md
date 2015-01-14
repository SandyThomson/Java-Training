### Chapter 9 Self Test

  1) _What class is at the top of the exception hierarchy?_
  
`Throwable`.

  2) _Briefly explain how to use `try` and `catch`._

Wrap blocks of code expected to throw `Exception` types with `try` and `catch` to
ensure the stack stops unwinding from the exception mechanism when it matches on
a catch that supports the exception type. For example:

```java
try {
  int[] is = new int[2];
  is[0xff] = 5;
} catch (ArrayIndexOutOfBoundsException e) {
  LOG.error("Something terrible happened.", e);
}
```

Multiple catch blocks can catch different types of exceptions. Catch blocks can
match multiple exception types if needed:

```java
try { deviousMethod() }
catch ( MyDeviousException | SomeMoreInnocentException e ) {
  LOG.error("Deviant!", e);
}
```

To ensure execution of cleanup code, a finally block can be included after the
`try`/any `catch` blocks. Java supports a primitive form of RAII through
_try-with-resources_, allowing implementations of the `AutoCloseable` interface to
perform some cleanup upon exit of a try block:

```java
try ( AudioInputStream au = new AudioInputStream(new FileInputStream(file), format, len) ) {
  // Play WAV file...
} catch( IOException e ) { }
// Yay, the file was closed.
```

  3) _What is wrong with this fragment?_

```java
   //...
   vals[18] = 10;
   catch( ArrayIndexOutOfBoundsException exc ) {
     // handle error
   }
```

It doesn't use an associated try block with which to catch exceptions from.

  4) _What happens if an exception is not caught?_

It continues unwinding the stack until it reports the exception to the JVM instance
(exiting the application).

  5) _What is wrong with this fragment?_

```java
class A extends Exception { ...

class B extends A { ...

// ...

try {
  // ...
}
catch(A exc) { ... }
catch(B exc) { ... }
```

The base type is caught first, which would mean all exceptions of type `B` are
matched by the first catch block, making the second catch block unreachable code.

  6) _Can an inner `catch` rethrow an exception to an outer `catch`?_

Sure, go ahead.

  7) _The `finally` block is the last bit of code executed before your program ends.
      True or False? Explain your answer._

False; or at least, not necessarily true (you could feasibly make the last code executed
in main within a `finally` block). The `finally` block will always run after a `try`, following
handling of any `catch` blocks, or, if no exception is thrown, the finally block will execute
following exit of the `try` block (or prior to return from a method, where the try block contains
`return` statements).

  8) _What type of exceptions must be explicitly declared in a `throws` clause of a method?_

Those derived from `Throwable`, but not derived from `RuntimeException` or `Error`.

  9) _What is wrong with this fragment?_

```java
class MyClass { // ... }
// ...
throw new MyClass(); 
```

`MyClass` is not derived from `Throwable`.

 10) _In question 3 of the Chapter 6 Self Test, you created a `Stack` class. Add custom exceptions
      to your class that report stack full and stack empty conditions._

See [StackDemo.java](src/org/java/training/StackDemo.java).

 11) _What are the three ways that an exception can be generated?_

  * An error in the JVM, e.g. `OutOfMemoryError`.
  * An error reported for unsafe operations by Java, e.g. `ArithmeticException`.
  * An exception type thrown from code via the `throw` statement.
 
 12) _What are the two direct subclasses of `Throwable`?_

`Exception` and `Error`.

 13) _What is the multi-catch feature?_

An attempt at reducing Java boilerplate by allowing multiple unrelated exception types to be handled
in the same catch block - the restriction is, the most base type they're both a part of will be 
used as the interface for this type. For example:

```java
try { evilMethod() }
catch ( IOException | DeathByAtomicBeesException e ) {
  e.printStackTrace(); // Can use methods of `Throwable`.
}
```

 14) _Should your code typically catch exceptions of type `Error`?_

Nah, not a whole lot you can do. Just let the JVM do its biz.
