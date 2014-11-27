## Java Training - Chapter 5 Self Test

1) _Show two ways to declare a one-dimensional array of 12 doubles._

`Double var[] = new Double[12];`
`Double[] var = new Double 12;`

2) _Show how to initialise a one-dimensional array of integers to the values 1 through 5._

`Int[] values = { 1, 2, 3, 4, 5 };`

3) _Write a program that uses an array to find the average of 10 double values. Use any 10 values you like._

See Double.java

4) _Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works._

See Bubble.java

5) _What is the difference between the **String** methods of **indexOf()** and **lastIndexOf()**?_

**indexOf()** will return the first instance of the argument while **lastIndexOf()** will return the last instance of it 

6) _Since all strings are objects of type **String**, show how you can call the **length()** and **charAt()** methods on this string literal: "I like Java"._

**"I like Java".length()** and **"I like Java".charAt()**

7) _Expanding on the **Encode** cipher class, modify it so that it uses an eight-character string as the key._

See Encode.java

8) _Can the bitwise operators be applied to the double type?_

Nope.

9) _Show how this sequence can be rewritten using the **?** operator._

```
if (x < 0) y = 10;
else y = 20;
```

`y = ( x < 0 ) ? 10 : 20;`

10) _In the following fragment, is the **&** a bitwise or logical operator? Why?_

```
boolean a,b;
// ...
if (a & b) ...
```

Logical

11) _Is it an error to overrun the end of an array? Is it an error to index an array with a negative value?_

Yes, and yes

12) _What is the unsigned right-shift operator?_

`>>>`

13) _Rewrite the **MinMax** class shown earlier in this chapter so that it uses a for-each style **for** loop._

See MinMax.java

14) _Can the for loops that perform sorting in the Bubble class show in Try This 5-1 be converted into for-each style loops? If not, why not?_

No for both loops in there. The first sets the counter variable required by the inner loop and the inner loop is changing the array assignments which can't be done by a foreach loop.

15) _Can a **String** control a **switch** statement?_

As of Java 7 it can \o/