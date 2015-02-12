# mssw Chapter 13 Generics Friday 13th Feb :boom:

## 1. Generics are important to Java because they enable the creation of code that is:

1. Type Safe
1. Reusable
1. Reliable
1. All of the above.

D

## 2. Can a primitive type be used as a type argument?

No, you would have to use its wrapper class.

## 3. Show how to declare a class called **FlightSched** that takes two generic parameters.

```java
public class <T, V> FlightSched {
}
```

## 4. Beggining with your answer to question 3, change **FlightSched**'s second type parameter so that it must extend **Thread**

```java
public class <T, V extends Thread> FlightSched {
}
```

## 5. Now, change **FlightSched** so that its second type parameter must be a subclass of its first paramter.

```java
public class <T, V extends T> FlightSched {
}
```

## 6. As it relates to generics, what is the **?** and what does it do?

The **?** is a wildcard type. It allows any type.

## 7. Can the wildcard argument be bounded?

yes

## 8. A generic method called **MyGen()** has one type parameter. Furthermore, **MyGen()** has one parameter whose type is that of the type parameter. It also returns an object of that type parameter. Show how to declare **MyGen()**.

```java
public <T> T MyGen(T t){
	// TODO:
	return t;
}
```

## 9. Given this generic interface:

```java
interface IGenIF<T, V extends T> {
```

**Show the declaration of a class called _MyClass_ that implements IGenIF.**

```java
public class MyClassCommaImplementerOfTheAlmightyIGenIFWichIsAnInterfaceIfYouDidnApostropheTKnow <T, V extends T> implements IGenIF<T, V> {
```

## 10. Given a generic class called Counter<T>, show how to create an object of its raw type.

```java
Counter counter = new Counter();
```

## 11. Do type parameters exist at runtime? 

Nope, unfortunately the book spoiled the magic... they are all compiled into casts everywhere...

## 12. Convert your solution to question 10. of the self test for chapter 9 so thay it is generic. In the process, create a stack interface called **IGenStack** that generically defines the operations **push()** and **pop()**.

Please see #104

## 13. What is **<>**?

The <img src="http://hydra-media.cursecdn.com/minecraft.gamepedia.com/e/ea/Diamond.png?version=84c328dac5feb7e738c410ac89fb511a" /> operator. It allows short hand for creating generic objects by inferring the type from what you are assigning it to or passing it to. 

## 14. How can the following be simplified?

```java
MyClass<Double, String> obj = new MyClass<Double, String>(1.1, "Hi");
```

Simplified Chinese:

```java
我班<双，字符串> 的OBJ = 我班<双，字符串>（ 1.1 ， “你好” ）;
```

Simplified:

```java
MyClass<Double, String> obj = new MyClass<>(1.1, "Hi");