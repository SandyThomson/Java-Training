
  1. `Throwable` is at the top of the exception hierarchy. The subclasses of Throwable are Exception and Error.
  
  2. ```java
  try {
  	// Code that might cause an error
  }
  catch( ExceptionType e ){ // The exception you specifically want to handle
    // The action that the program should take if the exception occurs
  }
  ```
  
  3. No try block (or at least, no close curly bracket before the catch)
  
  4. It bubbles up and is reported by the JVM. Your program will exit immediately.
  
  5. The catch statement for Exception B is effectively unreachable code (as the catch statement for A would always catch B exceptions). 
  You'd reorder these catch statements to make this work.
  
  6. Yes
  
  7. A finally statement _could_ be the last bit of code executed before your program ends (e.g a top level exception handler), however it doesn't have to be.
  You can use finally after any try/catch blocks in your program. 
  
  8. Checked exceptions need to be declared in the 'throws' clause of a method. Unchecked exceptions don't.
  
  9. MyClass doesn't extend Throwable, or any of it's subclasses. Therefore, it cannot be thrown.
  
  10. See code.
  
  11. 1. By the JVM, 2. Standard exceptions (divide by zero , NPE - tend to be RuntimeExceptions), 3. Using the 'throw' keyword
  
  12. Error and Exception
  
  13. A multicatch is a feature that can handle multiple types of exception in the same catch block, meaning you don't need to duplicate code making your program cleaner.
  
  14. You typically wouldn't catch exceptions of type Error. I've never had to, and I suspect you are still totally fucked even if you tried.