## Java Training - Chapter 3 Self Test

  1) _Write a program that reads characters from the keyboard until a period is received.
     Have the program count the number of spaces. Report the total at the end of the program._
     
     (Spaaaaaaaaaaace.java)[src/main/java/ch3/Spaaaaaaaaaaace.java]

	
  2) _Show the general form of the *if-else-if* ladder._
  
  ```java
  if ( condition ){
  	//code
  }
  else if ( otherCondition ){
  	//more code
  }
  else if ( someOtherCondition ){
  	//even more code
 }
 //etc
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
this would associate with the `if (y > 100) {`
    
    
  4) _Show the *for* statement for a loop that counts from 1000 to 0 by -2._
  ```java
  int i = 0;
  for( int i = 1000; i >= 0; i-=2 ){
  	//not entirely sure what should be "counted"
  	System.out.println(++i);
  }
  ```
   
  5) _Is the following fragment valid?_

```java
for(int i = 0; i < num; i++)
  sum += i;
  
count = i;
```
No:
  * `num` is not defined or altered. Could result in an infinte loop.
  * `sum` is not defined.
  * `count` is not defined. Also `i` is being assigned to count, but `i` is out of scope by this point.
     
  6) _Explain what *break* does. Be sure to explain both of its forms._
  breaks out of the inner most loop it is placed within, or take thread of execution back to a given label.
  
    
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

Syntax error, x and y are not defined. If by some miracle they were defined, then the following would display:
<pre>
after while
after while
after while
after while
after while
after while
after while
after while
after while
after while
After for
</pre>


  8) _What does the following fragment print?_
  
```java
for(int i = 0; i<10; i++) {
  System.out.print(i + " ");
  if((i%2) == 0) continue;
  System.out.println();
}
```

erm...
```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at package.Class.method(File.java:lineNumber)
```
if we lived in a magical place where we could divide by 0, then the following would happen:
<pre>
42 
1 
2 3 
4 5 
6 7 
8 9 </pre>


  9) _The iteration expression in a *for* loop need not always alter the loop control
    variable by a fixed amount. Instead, the loop control variable can change in any
    arbitrary way. Using this concept, write a program that uses a *for* loop to
    generate progression 1, 2, 4, 8, 16, 32, and so on._
    
```java
for( int i = 1; i < 1024; i += i ){
  System.out.println( i );
}
```
 
  10) _The ASCII lowercase letters are separated from the uppercase letters by 32. Thus,
     to convert a lowercase letter to uppercase, subtract 32 from it. Use this information
     to write a program that reads characters from the keyboard. Have it convert all
     lowercase letters to uppercase, and all uppercase letters to lowercase, displaying
     the result. Make no changes to any other character. Have the program stop when the
     user enters a period. At the end, have the program display the number of case changes
     that have taken place._
     
  
  11) _What is an infinite loop?_
  a loop which is infinite.
  
    
  12) _When using *break* with a label, must the label be on a block that contains the *break*?_
Yes i think so.  
 
