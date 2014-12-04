### Chapter 6 Self Test

  1) _Given this fragment,_
```java
class X {
  private int count;
```

_is the following fragment correct?_

```java
class Y {
  public static void main(String args[]) {
    X ob = new X();
    
    ob.count = 10;
```

Assuming `Y` is a separate class and not a nested class (bit ambiguous in the example), then the fragment
will not compile due to an attempt at violating the `private` access modifier of `X.count`.

There's clearly _something_ between the end of the first fragment and the start of the second though, so 
if it's the following, it'll compile fine:

```java
class X {
	private int count;
	
static
class Y {
  public static void main(String args[]) {
    X ob = new X();

    ob.count = 10;
  }
}
}
```

  2) _An access modifier must ________ _a member's declaration._
  
Prepend.

  3) _The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened to a
     stack of plates. The first plate put on the table is the last plate used. Create a stack class called
     **Stack** that can hold characters. Call the methods that access stack `push()` and `pop()`. Allow the
     user to specify the size of the stack when it is created. Keep all other members of the **Stack**
     class private. (Hint: You can use the **Queue** class as a model; just change the way the data is
     accessed.)_
     
See [Stack.java](src/org/java/training/Stack.java).

  4) _Given this class,_
```java
class Test {
  int a;
  Test(int i) { a = i; }
}
```

_write a method called `swap()` that exchanges the contents of the objects referred to by two `Test` object references._
    
```java
  public static void swap(Test x, Test y) {
    x.a ^= (y.a ^= x.a);
    y.a ^= x.a;
  }
```

  5) _Is the following fragment correct?_
```java
class X {
  int meth(int a, int b) { ... }
  String meth(int a, int b) { ... }
```

No, the signature of `meth` isn't unique, so the compiler would be unable to unambiguously choose from
either method.

  6) _Write a recursive method that displays the contents of a string backwards._
  
```java
public static void reverser(String s, int i) {
  if ( i < 0 ) return;
  System.out.print(s.charAt(i));
  reverser(s, i - 1);
}

public static void reverser(String s) { reverser(s, s.length() - 1); }
```

  7) _If all objects of a class need to share the same variable, how must you declare that variable?_
  
`static`

  8) _Why might you need to use a **static** block?_
  
To perform some initialisation at class load time.

  9) _What is an inner class?_
  
A class defined within the scope of another that is granted access to the state of the enclosing class.
In java there are 4 types:
  * static inner classes: granted access to the enclosing classes static state.
  * instance inner classes: granted access to the enclosing instance state. Must be instantiated as
    part of an enclosing instance, for example - `Outer o = new Outer(); Outer.Inner io = o.new Inner();`.
  * local inner classes: granted access to the enclosing instance state as well as any final variables
    defined in the current scope.
  * anonymous inner classes: similar to local inner classes, except they are not defined with a class
    name, rather instantiated adhering to some interface, for example -
    `Runnable runner = new Runnable() { public void run() { System.out.println( "Running!" ); } };`
    
In some respects, the Java 8 lambdas are a type of inner class, though they are essentially anonymous inner
classes that implement a functional interface (that is, an interface that requires only 1 method be defined
in implementing classes). For example, the following is equivalent to the anonymous inner class example
above: `Runnable runner = () -> System.out.println( "Running!" );`

 10) _To make a member accessible by only other members of its class, what access modifier must be used?_
 
`private`

 11) _The name of a method plus its parameter list constitutes the method's ______.
 
Signature.

 12) _An `int` argument is passed to a method by using call-by-_______.
 
Value.

 13) _Create a varargs method called `sum()` that sums the `int` values passed to it. Have it return the
     result. Demonstrate its use._
     
```java
public static int sum(int... ns) {
  int sum = 0;
  for( int n : ns ) sum += n;
  return sum;
}

// Prints "The sum is: 286"
public static void main(String[] args) {
  System.out.printf( "The sum is: %d", sum( 3, 5, 23, 0xff ) );
}
```

 14) _Can a varargs method be overloaded?_
 
Yes, so long as it doesn't result in ambiguous method signatures.

 15) _Show an example of an overloaded varargs method that is ambiguous._
 
 ```java
  public static void each( int i, int... is ) {
    System.out.printf( "List [%d]: %s%n", i, Arrays.stream(is).mapToObj(Integer::toString).collect(Collectors.joining(" ")) );
  }
	 
  public static void each( int i, int j, int... is ) {
    System.out.printf( "List [%d::%d]: %s%n", i, j, Arrays.stream(is).mapToObj(Integer::toString).collect(Collectors.joining(" ")) );
  }

  public static void main( String[] args ) {
    each(3, 4, 6); // Oh no, ambiguous
  }
 ```
 
