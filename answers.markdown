# Chapter 6 Answers

1. Given this fragment

```java
class X {
	private int count;
```
Is the following fragment correct?

```java
class Y {
	public static void main( String args[] ){
		X ob = new X();
		ob.count = 10;
```

No, the count instance variable of `X` is private so cannot be accessed by `Y`.

2. An access modifier must ___preceed___ a member's declaration.

3. [Stack.java](src/main/java/Stack.java)

4. Given this class,

```java
class Test {
	int a;
	Test(int i){ a = 1; }
	
	public static swap( Test a, Test b ){
		int tmp = 0;
		
		tmp = a.a;
		a.a = a.b;
		a.b = tmp;
	}
}
```

5. Is the following fragment correct?

```java
class X {
	int meth( int a, int b) { ... }
	String meth( int a, int b) { ... }
}
```
you can only overload a method if the paramaters are different. In this case, only the return statements are different which is not enough.

6. Write a recursive method that displays the contents of a string backwards.

[I hate recursion late at night... so heres one the internet provided](src/main/java/StringFlipper.java)

7. If all objects of a class need to share the same variable, how must you declare that variable?

It must be declared `static`.

8. Why might you need to use a static block?

To initialize static variables before the objects are initialized.

9. What is an inner class?

A class that is inner.
(ie. declared within another class)

10. To make a member accessible by only the other membersof its class, what access modifier must be used?

`private`

11. The name of method plus its parameter list constitutes the method's ___signature___

12. An int argument is passed to a method by using call-by-___value___

13. Create a varargs method called `sum()` that sums the int values passed to it. Have it return the result. Demonstrate its use.

[Sum.java](src/main/java/Sum.java)

14. Can a varargs method be overloaded?

yes, but you have to make sure you don't cause ambiguity as to which method you want to call.

15. Show an example of an overloaded varargs method that is ambiguous.

```java
public void blarg( int... stuff ){ ... }
public void blarg( int number, int... array ){ ... }

blarg( 1, 2, 3 );
```
[relevant](https://i.imgflip.com/evp5x.jpg)