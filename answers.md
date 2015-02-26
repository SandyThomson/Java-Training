# mssw Chapter 14

## 1. What is the lambda operator?

```java
->
```

## 2. What is a functional interface?

An interface that contains only one method.

## 3.How do functional interfaces and lambda expressions relate?

The lambda express is an implementation of a functional interface.

## 4. What are the two general types of lambda expressions?

Had to look this one up, Expression lambdas and Block lambdas... although I wouldn't call them two different *types*...

You wouldn't label these as two different types of if statements:

```java
if(thing == null)
	return false;

if(thing != null){
	return true;
}
```

## 5. Show a lambda expression that returns true if a number is between 10 and 20, inclusive.

```java
num -> {
	if( num >= 10 && num <= 20 ){
		return true;
	}
	return false;
}
``` 

## 6. Create a functional interface to support the lambda expression created in 5. Call the interface **MyTest** and its abstract method **testing()**.

```java
public interface MyTest {
	public <T extends Number> boolean testing(T number);
}
```

## 7. Create a ~~block~~ lambda that computes the factorial of an integer value. Demonstrate its use. Use **NumericFunc**, shown in this chapter, for the functional interface.

see [QuestionSeven](src/main/java/QuestionSeven.java)

## 8. Create a generic functional interface **MyFunc<T>**. Call its abstract method **func()**. Have **func()** return a reference of type **T**. Have it take a paramater of type **T**. (Thus **MyFunc** will be a generic form of **NumericFunc** shown in the chapter.) Demonstrate by rewriting the answer to question 7.

see [QuestionEight](src/main/java/QuestionEight.java)
and [MyFunk](src/main/java/MyFunk.java)

## 9. Using the program shown in Try This 14-1, create a lambda expression that removes all spaces from a string and returns the result. Demonstrate this method by passing it to **changeStr()**.

see [LambdaArgumentDemo](src/main/java/LambdaArgumentDemo.java)

## 10. Can a lambda expression use a local variable? If so, what constraint must be met?

If by local, you mean local to the method the lambda is in, rather than a variable within the lambda itself, then it must be final or treated as such from within the lambda.

## 11. If a lambda expression throws a checked exception, the abstract method in the functional interface must have a **throws** clause that includes that exception. True or False?

True just like any other method.

## 12. What is a method reference?

A reference to a method.

## 13. When evaluated, a method reference creates an instance of the \_\_\_\_\_\_\_ \_\_\_\_\_\_\_\_ supplied by its target context.

_Functional Interface_

## 14. Given a class call **MyClass** that contains a **static** method called **myStaticMethod()**, show how to specify a method reference to **myStaticMethod()**. 

```java
MyClass::myStaticMethod
```

## 15. Given a class called **MyClass** that contains an instance method called **myInstMethod()** and assuming an object of **MyClass** called **mcObj**, show how to create a method reference to **myInstMethod()** on **mcObj**.

```java
mcObj::myInstMethod
```

## 16. To the **MethodRefDemo2** program, add a new method to **MyIntNum** called **hasCommonFactor()**. Have it return **true** if its **int** argument and the value stored in the invoking **MyIntNum** object have at least one factor in common, For example, 9 and 12 have a common factor, which is 3, but 9 and 16 have no common factor. Demonstrate **hasCommonFactor()** via a method reference.

## 17. How is a constructor reference specified?

```java
MyClass::new
```

## 18. Java defines several predefined functional interfaces in what package?

```java
java.util.function;
```
