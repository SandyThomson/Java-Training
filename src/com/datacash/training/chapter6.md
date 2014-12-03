1) The fragment is not correct, because `count` is private, so it cannot be accessed by a direct reference from outside the class.

2) An access modifier must precede a member's declaration.

3) See QuestionThree.java/Stack.java

4) 
```java
void swap( Test one, Test two ) {
	int placeholder = one.a;
	one.a = two.a;
        two.a = placeholder;
}
```

5) The fragment is not correct, as overloaded methods cannot be defined by different return types. They must have different arguments.

6)
```java
void sdrawkcab( String toReverse ) {
	int length = toReverse.length();
	if ( length > 0 ) {
		System.out.println( toReverse.charAt(length - 1 ) );
		sdrawkcab( toReverse.substring(0, length-1) );
	}
}
```

7) You should declare the variable `static`.

8) A static block might be needed for initialization of the class before any instances are instantiated.

9) An inner class is a class that is defined within another class.

10) private

11) The name of a method plus its parameter list constitutes the method's signature;

12) An int argument is passed to a method by using call-by-value.

13) See QuestionThirteen.java

14) A varargs method can be overloaded.

15)
```java
void method( int arg1, int... args ) { //...
void method( int... args ) { //...

public static void main( String args[] ) {
	method( 1, 2, 3); // okay
	method( 1 ); // AMBIGUOUS
}
```
