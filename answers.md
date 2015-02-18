1) ``->``

2) A functional interface is an interface with one abstract method.

3) Lambda expressions can be used to create instances of functional interfaces.

4) The two types of lambda expression are expression and block.

5)
```java
(n) -> ( n => 10 && n <= 20 );
```

6)
```java
interface MyTest {
	boolean testing( Integer n );
}
```

7)
```java
NumericFunc factorialFunc = (n) -> { 
	int factorial = 1;
	for ( int i = 1; i <= n; i++ ) {
		factorial *= i;
	}
	return factorial;
}

factorialFunc.func(10);
```

8)
```java
interface MyFunc<T> {
	T func(T obj);
}

MyFunc<Integer> factorialFunc = (n) -> { 
	int factorial = 1;
	for ( int i = 1; i <= n; i++ ) {
		factorial *= i;
	}
	return factorial;
}
```

9) See LambdaDemo.java

10) A lambda expression can use a local variable as long as it's effectively final. Pity, as you can do
some neat tricks with a local variable that you can modify.

11) True

12) A method reference allows methods to be referred to without executing them.

13) functional interface

14) ``MyClass::myStaticMethod``

15) ``mcObj::myStaticMethod``

16) See MethodRefDemo2.java

17) A constructor reference is specified with the ``new`` method name.

18) ``java.util.function``