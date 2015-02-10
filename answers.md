#### Chapter 13 Self-Test Answers

1) **D**.  It's _always_ 'All of the above'!

2)  No, but the _Type_ _Wrappers_ can.

3)
```java
public class FlightSched<T, V> {
}
```

4)
```java
public class FlightSched<T, V extends Thread> {
}
```

5)
```java
public class FlightSched<T, V extends T> {
}
```

6) *?* is a **wildcard**.  It is used when the exact type is unknown and matches all valid types.

7)  Yes.
```java
static void doSomething( SomeValue<? extends Number> ) {
}
```

8)
```java
public static <T> T MyGen( T t) {
  return t;
}
```

9)
```java
public class MyClass<T, V extends T> implements IGenIF<T, V> {
}
```

10)
```java
Counter counter = new Counter();
```

11)  No.  The type parameters are _erased_ at compile time.

12) See [Stack.java](src/com/selftest/stack/Stack.java)

13)  The **diamond** operator used for _Type_ _Inference_.

14)  
```java
MyClass<Double, String> obj = new MyClass<>(1.1, "Hi");
```