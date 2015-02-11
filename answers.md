### Chapter 13 - Self Test

  1) _Generics are important to Java because they enable the creation of code that is_
     A. _Type-safe_
     B. _Reusable_
     C. _Reliable_
     D. _All of the above_

D, in that generics _enable_ each, but writing generic code does not protect
you from breaking each. It is possible for generic code to be unsafe, unusable,
and unreliable.

  2) _Can a primitive type be used as a type argument?_

No. Java generic parameters are type erased to an `Object` or bound reference type,
and as such can only be references. As to why this is the case, and the Java
compiler doesn't just allow casting from parameter types to primitives during
compilation - this is largely down to alignment - a Java instance is just a reference
to memory allocated elsewhere (statically, or on the heap, etc.), type erasure therefore
doesn't alter the memory layout of the parameterized type, a `T` instance is still just
a pointer. Primitives, however, are allocated in place, that is, on the stack for primitives
defined in a method body, or as part of the memory layout of the enclosing instance for
member variables. A class that allows type parameters as primitives would need to be able
to create instances with _different_ memory layouts from each other (which is a little more
like how C++ handles parametric polymorphism).

  3) _Show how to declare a class called `FlightSched` that takes two generic parameters._

```java
class FlightSched<T, E> {}
```

  4) _Beginning with your answer to question 3, change `FlightSched`'s second type
      parameter so that it must extend `Thread`._

```java
class FlightSched<T, E extends Thread> {}
```

  5) _Now, change `FlightSched` so that its second type parameter must be a subclass of
      its first type parameter._

```java
class FlightSched<T, E extends T> {}
```

  6) _As it relates to generics, what is the `?` and what does it do?_

`?` is the wildcard, essentially allowing Java's version of an existential type.
It allows parameterized types to be passed around without knowing the exact type
of the parameter. If the type applies bounds to the parameter, the wildcard will
respect that. Wildcards can also be further bounded:

```java
  public void runAllTheThings( List<? extends Runnable> theThings ) { 
```

  7) _Can the wildcard argument be bounded?_

Yup, see #6.

  8) _A generic method called `myGen()` has one type parameter. Furthermore,
      `myGen()` has one parameter whose type is that of the type parameter. It
      also returns an object of that type parameter. Show how to declare `myGen()`._

```java
<T> T myGen(T arg)
```

  9) _Given this generic interface_
```java
interface IGenIF<T, V extends T> { // ...
```
_show the declaration of a class called `MyClass` that implements `IGenIF`._

`IGenIF` - seriously? That's the name you went with? You should feel bad, and your
editor should feel bad.

Anyway:
```java
class MyClass implements IGenIF<Number, Long>
```

 10) _Given a generic class called `Counter<T>`, show how to create an object of its
      raw type._

```java
Counter count = new Counter(0);
```

 11) _Do type parameters exist at run time?_

No.

 12) _Convert your solution to question 10 of the Self Test for Chapter 9 so that it is
      generic. In the process, create a stack interface called `IGenStack` that generically
      defines the operations `push()` and `pop()`._

See [StackDemo.java](src/org/java/training/StackDemo.java).

 13) _What is `<>`?_

The diamond operator. It is used to infer type parameters based on its assignment target.

 14) _How can the following be simplified?_
```java
MyClass<Double,String> obj = new MyClass<Double,String>(1.1, "Hi");
```

```java
MyClass<Double, String> obj = new MyClass<>(1.1, "Hi");
```