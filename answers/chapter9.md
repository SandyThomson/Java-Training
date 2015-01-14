## Java Training - Chapter 9 Self Test

1) _What class is at the top of the exception hierarchy?_

2) _Briefly explain how to use **try** and **catch**._

3) _What is wrong with this fragment?_

```
// ...
vals[18] = 10;
catch (ArrayIndexOutOfBoundsException exc) {
  // handle error
}
``` 

4) _What happens if an exception is not caught?_

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

6) _Can an inner **catch** rethrow an exception to an outer **catch**?_

7) _The **finally** block is the last bit of code executed before your program ends. True or False? Explain your answer._

8) _What type of exceptions must be explicitly declared in a **throws** clause of a method?_

9) _What is wrong with this fragment?_

```
class MyClass { // ... }
// ...
throw new MyClass();
```

10) _In question 3 of the Chapter 6 Self Test, you created a **Stack** class. Add custom exceptions to your class that report stack full and stack empty conditions._

11) _What are the three ways that an exception can be generated?_

12) _What are two direct subclasses of **Throwable**?_

13) _What is the multi-catch feature?_

14) _Should you code typically catch exceptions of type **Error**?_