### Chapter 13 Self Test

1) _Generics are important to Java because they enable the creation of code that is: **A.** Type-safe, **B.** Reusable, **C.** Reliable or **D.** All of the above?_

All of the above

2) _Can a primitive type be used as a type argument?_

No

3) _Show how to declare a class called **FlightSched** that takes two generic parameters._

`public class FlightSched<T,V> { ...` 

4) _Beginning with your answer to question 3, change **FlightSched**'s second type parameter so that it must extend **Thread**._

`public class FlightSched<T,V extends Thread> { ...` 

5) _Now, change **FlightSched** so that its second type parameter must be a subclass of its first type parameter._

`public class FlightSched<T,V extends T> { ...` 

6) _As it relates to generics, what is the **?** and what does it do?_

**?** is a wild card to indicate any valid type

7) _Can the wildcard argument be bounded?_

Yes

8) _A generic method called **MyGen()** has one type parameter. Furthermore, **MyGen()** has one type parameter whose type is that of the type parameter. It also returns an object of that type parameter. Show how to declare **MyGen()**._

`public T MyGen<T>( T param ) { ...`

9) _Given the generic interface `interface IGenIF<T, V extends T> { // ...` show the declaration of a class called **MyClass** that implements **IGenIF**._

`public class MyClass<T,V extends T> implements IGenIF<T,V> { ...`

10) _Given a generic class called **Counter<T>**, show how to create an object of its raw type._

`Counter foo = new Counter;`

11) _Do type parameters exist at run time?_

No, these are handled at compile time as part of the erasure process

12) _Convert your solution to question 10 of the Self Test for Chapter 9 so that it is generic. In the process, create a stack interface called **IGenStack** that generically defines the operations **push()** and **pop()**._

See [GenericStack](../src/chapter13/GenericStack.java)

13) _What is **<>**?_

The diamond operator, used to specify the type in generics

14) _How can the following be simplified?_

`MyClass<Double,String> obj = new MyClass<Double,String>(1.1,"Hi");`

`MyClass<Double,String> obj = new MyClass<>(1.1,"Hi");`