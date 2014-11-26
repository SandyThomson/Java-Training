# Chapter 5

1) **Show 2 ways to declare a 1d array of 12 doubles**

```java
double[] first = new double[12];
double second[] = new double[12];
```

2) **Show how to initialise a 1d array with integers to the values 1 through 5.**

```java
int[] blarg = { 1, 2, 3, 4, 5};
```

3) **Write a program that uses an array to find the average of 10 double values.**

[Averagenator](src/main/java/Averagenator.java)

4) **Change the sort in try-this 5-1 so that it sorts an array of Strings.**

[StringSorter](src/main/java/StringSorter.java)

5) **What is the difference between the String methods** `indexOf()` **and** `lastIndexOf()`

[indexOf](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-) This will return the first occurrence of the character being searched for.

[lastIndexOf](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#lastIndexOf-int-) This will return the last occurrence of the character being searched for.

6) **Since all Strings are Objects of type String, show how you can call the length() and charAt() methods on this String literal: "I like Java"**

```java
"I like Java".length();
"I like Java".charAt();
```

7) **Expanding on the Encode cypher class, modify it so that it uses an eight character String as the key.**

[Encode](src/main/java/Encode.java)

8) **Can the bitwise operators be applied to the double type?**

No, apparently...

9) **Show how this sequence can be rewritten with the ? operator**

```java
int y = x < 0 ? 10 : 20;
```

10) **In the following fragment, is the & a bitwise or logical operator? Why?**

```java
boolean a, b;
//...
if( a & b ) ...
```
This would be a logical operator because bitwise operators will not work on booleans.

11) **Is it an error to overrun the end of an array? Is it an error to index an array with a negative value?**

Accessing a value outside of an array with throw an `IndexOutOfBoundsException`.
Yes it would cause an error to use a negative index to extract a value.

12) **What is the unsigned right-shift operator?**

`>>>` - This operator will not preserve the sign bit when shifting. This means that the value -1, eg:
```
11111
```
will become
```
01111
```

13) **Rewrite the MinMax class shown earlier in this chapter so that is uses a for-each loop**

[MinMax](src/main/java/MinMax.java)

14) **Can the for loops that perform sorting in the Bubble class shown in try this 5-1 be converted into foreach loops? If not, why not?**

Not with the code as it is. This is because the loop modifies the array as it is looping over it. This is not allowed in a foreach loop.

15) **Can a String control a switch statement?**

Yes in java 7+.