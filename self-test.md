### 1. _Show two ways to declare a one-dimensional array of 12 doubles._
```java
double foo[] = new double[12];
double[] bar = new double[12];
```

### 2. _Show how to initialize a one-dimensional array of integers to the values 1 through 5._
```java
int[] foo = { 1, 2, 3, 4, 5 };
```

### _3. Write a program that uses an array to find the average of 10 double values. Use any 10 values you like._
See [Average.java](src/selftest/Average.java)

### _4. Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works._
See [SortStringArray.java](src/selftest/SortStringArray.java)

### _5. What is the difference between the String methods indexOf( ) and lastIndexOf( )?_
`indexOf(String)` returns the index of the first occurrence of String in the target.

`lastIndexOf(String)`, as the name suggests, returns the index of the last occurrence of String in the target.

### _6. Since all strings are objects of type String, show how you can call the length() and charAt() methods on this string literal: "I like Java"._
```java
"I like Java".length();
"I like Java".charAt(3);
```

### _7. Expanding on the Encode cipher class, modify it so that it uses an eight-character string as the key._
See [Encode.java](src/selftest/Encode.java)

### _8. Can the bitwise operators be applied to the double type?_
No.

### _9. Show how this sequence can be rewritten using the ? operator._
```java
    if(x < 0) y = 10;
    else y = 20;
```

```java
( x < 0 ) ? y = 10 : y = 20;
```

### _10. In the following fragment, is the & a bitwise or logical operator? Why?_
```java
    boolean a, b;
    // ...
    if(a & b) ...
```
The `&` is logical here because the operands are boolean.

### _11. Is it an error to overrun the end of an array? Is it an error to index an array with a negative value?_
Yes, and yes.

### _12. What is the unsigned right-shift operator?_
`>>>`

### _13. Rewrite the MinMax class shown earlier in this chapter so that it uses a for-each style for loop._
See [MinMax.java](src/selftest/MinMax.java)

### _14. Can the for loops that perform sorting in the Bubble class shown in Try This 5-1 be converted into for-each style loops? If not, why not?_
The outer loop cannot be rewritten as a for-each because the inner loop uses its counter variable.  The inner one cannot be rewritten because its loop variable is needed to index array elements.

### _15. Can a String control a switch statement?_
Yes, as of Java 7.
