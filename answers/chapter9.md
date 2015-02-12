## Java Training - Chapter 9 Self Test

1) _What class is at the top of the exception hierarchy?_

**Throwable**

2) _Briefly explain how to use **try** and **catch**._

By surrounding a block of code that could throw an exception with a **try**, you can then catch specific exceptions and specify what to do with them using the **catch** statement, like so

```
try {
  // code that could throw exception
}
catch (ExceptionType e) {
 // what to do about e
}
```

3) _What is wrong with this fragment?_

```
// ...
vals[18] = 10;
catch (ArrayIndexOutOfBoundsException exc) {
  // handle error
}
``` 

There is no try block to encapsulate the code that could throw an **ArrayIndexOutOfBoundsException**

4) _What happens if an exception is not caught?_

A stack trace is thrown, showing the current user a potentially scary screen!

5) _What is wrong with this fragment?_

```
class A extends Exception { ...

class B extends A { ...

// ...

try {
  // ...
 }
catch (A exc) { ... }
catch (B exc) { ... }
``` 

The second catch will never be used as exceptions of type B are also of type A, due to B being a subclass of A.

6) _Can an inner **catch** rethrow an exception to an outer **catch**?_

Yes

7) _The **finally** block is the last bit of code executed before your program ends. True or False? Explain your answer._

False, the finally block will be run leaving its corresponding try, catch block but the code may continue beyond this point.

8) _What type of exceptions must be explicitly declared in a **throws** clause of a method?_

Any exception that is not a subclass of Error or RuntimeException and has not been caught as part of method

9) _What is wrong with this fragment?_

```
class MyClass { // ... }
// ...
throw new MyClass();
```

**MyClass** is not a subclass of **Throwable**

10) _In question 3 of the Chapter 6 Self Test, you created a **Stack** class. Add custom exceptions to your class that report stack full and stack empty conditions._

See code.

11) _What are the three ways that an exception can be generated?_

A problem with the JVM, a problem with the code written or explicitly using the **throw** statement.

12) _What are two direct subclasses of **Throwable**?_

**Exception** and **Error**

13) _What is the multi-catch feature?_

Alongs a single catch statement to handle multiple types of exceptions

14) _Should you code typically catch exceptions of type **Error**?_

No, these are JVM exceptions and are out with the scope of any programs being written