# MCM Chapter 14 Answers

**1. What is the lambda operator?**

A lambda expression is an annonymous method that is used to implement a method defined by a functional interface. Lambda expressions introduce a new operator, -> which divides the expression into two parts. The left side are parameters, and the right side the actions of the expression.

**2. What is a functional interface?**

A functional interface only specifies one abstract method e.g.,

```java
	
	interface MyValue{
		double getValue();
	}
	
```

**3. How do functional interfaces and lambda expressions relate?**#

Lambda expressions define the implementation of the abstract method in a functional interface.

**4. What are the two general types of lambda expressions?**

The two general types are *expression lambdas* - consisting of a single line of code, or *block lambdas* - consisting of blocks of code.

**5. Show a lambda expression that returns true if a number is between 10 and 20, inclusive.**

```java
	
	myTest = (n) -> n >= 10 && n <=20;

```

**6. Create a functional interface that can support the lambda expression you created in question 5. Call the interface MyTest and its abstract method testing( ).**

```java
	
	interface myTest{
		boolean testing(int n);
	}
	
```

**7. Create a block lambda that computes the factorial of an integer value. Demonstrate its use. Use NumericFunc, shown in this chapter, for the functional interface.**

See [FactiorialLambdaDemo.java](FactiorialLambdaDemo.java)

**8. Create a generic functional interface called MyFunc<T>. Call its abstract method func( ). Have func( ) return a reference of type T. Have it take a parameter of type T. (Thus, MyFunc will be a generic version of NumericFunc shown in the chapter.) Demonstrate its use by rewriting your answer to question 7 so it uses MyFunc<T> rather than NumericFunc.**

See [FactiorialLambdaDemo.java](FactiorialLambdaDemo.java)

**9. Using the program shown in Try This 14-1, create a lambda expression that removes all spaces from a string and returns the result. Demonstrate this method by passing it to changeStr( ).**

See [LambdaArgumentDemo.java](LambdaArgumentDemo.java)

**10. Can a lambda expression use a local variable? If so, what constraint must be met?**

A lambda expression can use a local variable as long as it is effecively final - meaning it doesn't change after it is first assigned.

**11. If a lambda expression throws a checked exception, the abstract method in the functional interface must have a throws clause that includes that exception. True or False?**

True

**12. What is a method reference?**

A method reference is a way of referring to a method without executing it.

**13. When evaluated, a method reference creates an instance of the ____________ ___________ supplied by its target context.**

Functional Interface

**14. Given a class called MyClass that contains a static method called myStaticMethod( ), show how to specify a method reference to myStaticMethod( ).**

```java
	
	MyClass::myStaticMethod
	
```

**15. Given a class called MyClass that contains an instance method called myInstMethod( ) and assuming an object of MyClass called mcObj, show how to create a method reference to myInstMethod( ) on mcObj.**

```java

	mcObj::myInstMethod

```

**16. To the MethodRefDemo2 program, add a new method to MyIntNum called hasCommonFactor( ). Have it return true if its int argument and the value stored in the invoking MyIntNum object have at least one factor in common. For example, 9 and 12 have a common factor, which is 3, but 9 and 16 have no common factor. Demonstrate hasCommonFactor( ) via a method reference.**

See [MethodRef2Demo.java](MethodRef2Demo.java)

**17. How is a constructor reference specified?**

classname::new

**18. Java defines several predefined functional interfaces in what package?**

java.util.function
