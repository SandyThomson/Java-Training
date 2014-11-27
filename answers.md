## Chapter 5 Self Test

  1) _Show two ways to declare a one-dimensional array of 12 **doubles**._
  
 ```java
 double[] vals = new double[12];
 ```
 
 ```java
 double vals[] = new double[12];
 ```
 
  2) _Show how to initialize a one-dimensional array of integers to the values 1 through 5._
   
 ```java
 int[] vals = { 1, 2, 3, 4, 5 };
 ```
 
  3) _Write a program that uses an array to find the average of 10 **double values**. Use any
     10 values you like._
     
See [Average.java](src/org/java/training/Average.java).

  4) _Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works._
  
See [StringSort.java](src/org/java/training/StringSort.java).

  5) _What is the difference between the String methods `indexOf()` and `lastIndexOf()`?_
  
`indexOf()` will return the index of the first matching character, whereas `lastIndexOf()` will return the
index of the last matching character. Both will return _-1_ in the event of no matches.

  6) _Since all strings are objects of type `String`, show how you can call the `length()` and `charAt()`
    methods on this string literal "I like Java"._
    
```java
String like = "I like Java";
int len = like.length();
char ch = like.charAt(4);
```

Or without assigning to a reference:

```java
"I like Java".charAt(3);
```

  7) _Expanding on the `Encode` cipher class, modify it so that it uses an eight-character string as the key._
  
See [BadEncode.java](src/org/java/training/BadEncode.java).

  8) _Can the bitwise operators be applied to the `double` type?_
  
Nope.

  9) _Show how this sequence can be rewritten using the `?` operator._
```java
if(x < 0) y = 10;
else y = 20;
```

```java
y = x < 0 ? 10 : 20;
```

 10) _In the following fragment, is the `&` a bitwise or logical operator? Why?_
```java
boolean a, b;
// ...
if(a & b) ...
```

It is a logical operator because it operates on boolean values.

 11) _Is it an error to overrun the end of an array? Is it an error to index an array with a negative value?_
 
Yes, an `ArrayIndexOutOfBoundsException` for either an overrun or negative index.
 
 12) _What is an unsigned right-shift operator?_
 
A bitwise right-shift that doesn't extend the sign bit. For example signed right shift 2 of high byte `1000 0000` is
`1110 0000`, but unsigned right shift 2 of the same byte is `0010 0000`.

 13) _Rewrite the `MinMax` class shown earlier in this chapter so that it uses a for-each style `for` loop._
 
 See [MinMax.java](src/org/java/training/MinMax.java).
 
 14) _Can the `for` loops that perform sorting in the `Bubble` class shown in `Try This 5-1` be converted into
     for-each style loops? If not, why not?_
     
No. Sorting algorithms operate by comparing and swapping values held at different indices in each iteration
whereas the for-each loop operates on one value at a time.

 15) _Can a `String` control a `switch` statement?_
 
 Sure, since Java 7.
