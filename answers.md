## Chapter 14 Self Test

  1) _What is the lambda operator?_

`->`, used to indicate a lambda expression, and separate the list of parameters
from the lambda body.

  2) _What is a functional interface?_

An interface in which one method requires implementation for an instance to be
concrete - implementations must implement a single abstract method.

  3) _How do functional interfaces and lambda expressions relate?_

Functional interfaces are the target type of lambda expressions, that is, a lambda
expression will resolve to an instance of the functional interface.

  4) _What are the two general types of lambda expressions?_

Expression based lambdas, in which the body consists of a single expression in which
the return type is the result of that expression (or the expression is discarded for
void returning interfaces), and block lambdas, in which the body of the lambda is defined
within a block, allowing multiple subexpressions but requiring explicit return.

  5) _Show a lambda expression that returns `true` if a number is between 10 and 20,
      inclusive._

```java
Predicate<Integer> p = i -> i >= 10 && i <= 20;
```

  6) _Create a functional interface that can support the lambda expression you created
      in question 5. Call the interface `MyTest` and its abstract method `testing()`._

```java
@FunctionalInterface
interface MyTest<T> {
	boolean testing(T t);
}
```

  7) _Create a block lambda that computes the factorial of an integer value. Demonstrate
      its use. Use `NumericFunc`, shown in this chapter, for the functional interface._

See [FactorialLambda.java](src/org/java/training/FactorialLambda.java).

  8) _Create a generic functional interface called `MyFunc<T>`. Call its abstract method
      `func()`. Have `func()` return a reference of type `T`. (Thus, `MyFunc` will be
      a generic version of `NumericFunc` shown in the chapter.) Demonstrate its use by
      rewriting your answer to question 7 so it uses `MyFunc<T>` rather than `NumericFunc`._

See [FactorialLambdaGeneric.java](src/org/java/training/FactorialLambdaGeneric.java).

  9) _Using the program shown in **Try This 14-1**, create a lambda expression that removes all
      spaces from a string and returns the result. Demonstrate this method by passing it to
      `changeStr()`._

See [SpaceRemover.java](src/org/java/training/SpaceRemover.java).

 10) _Can a lambda expression use a local variable? If so, what constraint must be met?_

Yes, on the condition that the local variable is _effectively final_. This just means that
captured variables become implicitly final (and thus don't require the final keyword), and
thus the lambda expression or surrounding method is not allowed to re-assign to it. 

 11) _If a lambda expression throws a checked exception, the abstract method in the functional
      interface must have a `throws` clause that includes that exception. True or False?_
 
 True.
 
 12) _What is a method reference?_

The coercion of a method to a type that implements a functional interface. The signature of the
method must be compatible with the target interface. This is essentially a useful wrapper around
lambda expressions that only dispatch to another method, for example:

```java
Arrays.asList("Hello", "Kittehs").stream().forEach(s -> System.out.println(s));
```

Can be more conveniently written:

```java
Arrays.asList("Hello", "Kittehs").stream().forEach(System.out::println);
```

 13) _When evaluated, a method reference creates an instance of the ______ ______ _supplied
      by its target context._

Functional interface.

 14) _Given a class called `MyClass` that contains a `static` method called `myStaticMethod()`,
      show how to specify a method reference to `myStaticMethod()`.

```java
Producer<String> in = MyClass::myStaticMethod;
```

 15) _Given a class called `MyClass` that contains an instance method called `myInstMethod()` and
      assuming an object of `MyClass` called `mcObj`, show how to create a method reference to
      `myInstMethod()` on `mcObj`._

```java
Consumer<Burgers> moi = mcObj::myInstMethod;
```

 16) _To the `MethodRefDemo2` program, add a new method to `MyIntNum` called `hasCommonFactor()`.
      Have it return `true` if its `int` argument and the value stored in the invoking `MyIntNum`
      object have at least one factor in common. For example, 9 and 12 have a common factor, which is 3,
      but 9 and 16 have no common factor. Demonstrate `hasCommonFactor()` via a method reference._

See [CommonFactor.java](src/org/java/training/CommonFactor.java).

 17) _How is a constructor reference specified?_

The same way as a static method reference:

```java
Producer<StringBuilder> getStrings = StringBuilder::new;
```

 18) _Java defines several predefined functional interfaces in what package?_
 
 `java.util.function`.

