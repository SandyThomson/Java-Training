## Chapter 2 Answers

   1) Java strictly specifies the range and behaviour of primitive types to
      preserve portability across different hardware.
   
   2) Java's character type is unicode (UTF8 for single values, interestingly UTF16 for
      arrays and Strings to guarantee fixed-width contiguous memory usage).
      This differs from some other languages that typically use fixed-width 8
      bit characters.
      
   3) False, a boolean value can only be assigned true/false literals, or the result of
      a logical or relational operator.
   
   4)

```java
    System.out.println( "One\nTwo\nThree" );   
```

   5) `i` is not declared, `sum` is not initialised, and an attempt is made to use
      `sum` outside of the scope is was declared in.
      
   6) The prefix form of increment operator increments the value and returns
      the result after the increment, the postfix form returns the result
      prior to the increment.
      
   7)
   
```java
if ( y != 0 && x / y > z ) { /* ... */ } 
```

   8) `byte` and `short` are promoted to `int` in an expression.
   
   9) A cast is needed when conversion between types may cause a loss of
      information (or when people don't understand `<T extends SomeClass>`
      parameterization, use the `SomeClass` interface and cast it to the
      desired type later on `</rant>`).
      
  10) See `PrimeNumbers.java`.
  
  11) Not at all, otherwise Lisp would be screwed.
  
  12) Yes, a block defines a scope.
