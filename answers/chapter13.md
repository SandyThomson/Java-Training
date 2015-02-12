### Chapter 13 Self Test

1) _Generics are important to Java because they enable the creation of code that is: **A.** Type-safe, **B.** Reusable, **C.** Reliable or **D.** All of the above?_

2) _Can a primitive type be used as a type argument?_

3) _Show how to declare a class called **FlightSched** that takes two generic parameters._

4) _Beginning with your answer to question 3, change **FlightSched**'s second type parameter so that it must extend **Thread**._

5) _Now, change **FlightSched** so that its second type parameter must be a subclass of its first type parameter._

6) _As it relates to generics, what is the **?** and what does it do?_

7) _Can the wildcard argument be bounded?_

8) _A generic method called **MyGen()** has one type parameter. Furthermore, **MyGen()** has one type parameter whose type is that of the type parameter. It also returns an object of that type parameter. Show how to declare **MyGen()**._

9) _Given the generic interface `interface IGenIF<T, V extends T> { // ...` show the declaration of a class called **MyClass** that implements **IGenIF**._

10) _Given a generic class called **Counter<T>**, show how to create an object of its raw type._

11) _Do type parameters exist at run time?_

12) _Convert your solution to question 10 of the Self Test for Chapter 9 so that it is generic. In the process, create a stack interface called **IGenStack** that generically defines the operations **push()** and **pop()**._

13) _What is **<>**?_

14) _How can the following be simplified?_

`MyClass<Double,String> obj = new MyClass<Double,String>(1.1,"Hi");`