## Java Training - Chapter 3 Self Test

  1) _Write a program that reads characters from the keyboard until a period is received.
     Have the program count the number of spaces. Report the total at the end of the program._
     
  Ans) See SpaceCounter.java

	
  2) _Show the general form of the *if-else-if* ladder._
  
  Ans) if ( condition ) {
    // Statement
  }
  else if ( condition ) {
    // Statement
  }
  else {
    // Statement
  }
  
  
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

  Ans) if (!done) x = z;
    
    
  4) _Show the *for* statement for a loop that counts from 1000 to 0 by -2._
  
  Ans) for ( i = 1000; i >= 0; i -= 2 )
   
  5) _Is the following fragment valid?_

```java
for(int i = 0; i < num; i++)
  sum += i;
  
count = i;
```

  Ans) No i is not in scope when count is set
    
  6) _Explain what *break* does. Be sure to explain both of its forms._
  
  Ans) break will stop the loop or case it is called within (innermost) and break label will stop execution of the block with that label
  
    
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

  Ans) after while
       After for


  8) _What does the following fragment print?_
  
```java
for(int i = 0; i<10; i++) {
  System.out.print(i + " ");
  if((i%2) == 0) continue;
  System.out.println();
}
```

  Ans) 0 1
       2 3
       4 5
       6 7
       8 9


  9) _The iteration expression in a *for* loop need not always alter the loop control
    variable by a fixed amount. Instead, the loop control variable can change in any
    arbitrary way. Using this concept, write a program that uses a *for* loop to
    generate progression 1, 2, 4, 8, 16, 32, and so on._
    
    Ans) See MathematicalSeries.java
    
 
  10) _The ASCII lowercase letters are separated from the uppercase letters by 32. Thus,
     to convert a lowercase letter to uppercase, subtract 32 from it. Use this information
     to write a program that reads characters from the keyboard. Have it convert all
     lowercase letters to uppercase, and all uppercase letters to lowercase, displaying
     the result. Make no changes to any other character. Have the program stop when the
     user enters a period. At the end, have the program display the number of case changes
     that have taken place._
     
     Ans) See CaseChange.java
     
  
  11) _What is an infinite loop?_
  
  Ans) A loop that will not end based on its condition statement
  
    
  12) _When using *break* with a label, must the label be on a block that contains the *break*?_
  
  Ans) Yes
  
 
