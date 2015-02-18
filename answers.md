#### Chapter 14 Self Test Answers

1)  The lambda operator is ```->```.  

2)  A _functional_ _interface_ is an interface which defines only one abstract method. 

3)  Lambda expressions provide the implementation of the abstract method defined by a functional interface that specifies it's target type.

4)  Expression Lambdas.
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
```
and Block Lambdas
```java
SomeFunctionalInterface<Integer> addOne = n -> {
  return n + 1;
}
```

5)  See [Range.java](src/com/selftest/Range.java)

6)  Again, see [Range.java](src/com/selftest/Range.java) but I **hate** the naming of the functional interface and would have preferred to just use an _IntPredicate_.

7)  See [Factorial.java](src/com/selftest/Factorial.java)

8)  Erm, please see [Factorial.java](src/com/selftest/Factorial.java). 

9)  See [RemoveSpaces.java](src/com/selftest/RemoveSpaces.java)

10)  Yes, but the constraint that must be met is that the variable must be _effectively_ _final_. By this we mean a variable which does not change value after it is first assigned.

11)  True.

12)  Hmm, it is a reference to a method. However, I _think_ they want us to say that is a way to refer to a method without executing it.

13)  _Functional_ _Interface_.

14)
```java
MyClass::myStaticMethod
``` 

15)
```java  
mcObj::myInstMethod
```

16) See [CommonFactor.java](src/com/selftest/CommonFactor.java)


17)  
```java
SomeClass::new;
```

18)  java.util.function.