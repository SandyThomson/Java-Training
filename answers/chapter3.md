## Java Training - Chapter 3 Self Test

  1) _Write a program that reads characters from the keyboard until a period is received.
     Have the program count the number of spaces. Report the total at the end of the program._

See SpaceCounter.java

  2) _Show the general form of the *if-else-if* ladder._
  
```  
  if (condition) {statement}
  else if (condition) {statement}
  else {statement}
```  
  
  3) _Given_
```java
  if(x < 10)
    if (y > 100) {
      if(!done) x = z;
      else y = z;
    }
  else System.out.println("error"); // what if?
```  

_to what if does the last *else* associate?_
    
`if (y > 100)` - Since there is no block associated with the `if(x < 10)`, everything up to the else line
is considered to be a single statement.
    
  4) _Show the *for* statement for a loop that counts from 1000 to 0 by -2._
   
`for ( int i = 1000; i >= 0; i -= 2 ) {}`
   
  5) _Is the following fragment valid?_

```java
for(int i = 0; i < num; i++)
  sum += i;
  
count = i;
```

No - i is only in scope for the `sum += i` statement
    
  6) _Explain what *break* does. Be sure to explain both of its forms._
  
break can be used to exit the current loop or a labelled loop that is currently iterating. It
is also used to exit a switch statement once the required condition has been fulfilled.
  
    
  7) _In the following fragment, after the *break* statement executes, what is displayed?_
  
```java
  for(i = 0; i < 10; i++) {
    while(running) {
      if(x<y) break;
      // ...
    }
    System.out.println("after while");
  }
  System.out.println("After for");
```

```
after while
After for
```

  8) _What does the following fragment print?_
  
```java
for(int i = 0; i<10; i++) {
  System.out.print(i + " ");
  if((i%2) == 0) continue;
  System.out.println();
}
```

```
0 
1 2 
3 4
5 6 
7 8 
9 
```

  9) _The iteration expression in a *for* loop need not always alter the loop control
    variable by a fixed amount. Instead, the loop control variable can change in any
    arbitrary way. Using this concept, write a program that uses a *for* loop to
    generate progression 1, 2, 4, 8, 16, 32, and so on._
    
See PowersOfTwo.java
 
  10) _The ASCII lowercase letters are separated from the uppercase letters by 32. Thus,
     to convert a lowercase letter to uppercase, subtract 32 from it. Use this information
     to write a program that reads characters from the keyboard. Have it convert all
     lowercase letters to uppercase, and all uppercase letters to lowercase, displaying
     the result. Make no changes to any other character. Have the program stop when the
     user enters a period. At the end, have the program display the number of case changes
     that have taken place._
     
See CaseSwitching.java     
  
  11) _What is an infinite loop?_
  
A loop with no terminating condition, usually without a control variable or iterator either. It
will run forever, or at least until someone adds ~~NullPointerException~~ break statement.
    
  12) _When using *break* with a label, must the label be on a block that contains the *break*?_
  
Yes! Otherwise it'd be a goto.
