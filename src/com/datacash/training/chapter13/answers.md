1) D. All of the above

2) No, only objects can be used as type arguments.

3)
```java
public class FlightSched<T, V> {
```

4)
```java
public class FlightSched<T, V extends Thread> {
```

5)
```java
public class FlightSched<T, V extends T> {
```

6) `?` is the wildcard argument, which can be used when the exact type is not known/

7) Yes, the wildcard argument can be bounded.

8) 
```java
public T MyGen ( T type ) {
```

9)
```java
public class MyClass<T, V> implements IgenIF<T, V extends T> {
```

10)
```java
Counter count = new Counter();
```

11) No, at runtime type parameters have been erased and replaced with the bound type.

12) See Question12.java

13) `<>` is the diamond operator, which allows some type declarations to be simplified, as shown in question 14.

14) 
```java
MyClass<Double,String> obj = new MyClass<>(1.1, "Hi");
```




