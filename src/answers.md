### Chapter 9 Self Test

 1) Throwable.
 2) The try block should surround the code for which exceptions are to be handled.
    Immediately following the try block the catch block(s) provide code to handle various types of exception which may be thrown within the scope of the try block.
 3) There is no try block preceeding the catch block.
 4) The exception will be handled by the JVM default behaviour is to terminate program execution and display a stack trace.  
 5) Since B is a subclass of A the catch block for B will be unreachable code and will cause a compilation error.
 6) Yes
 7) False in some cases finally may be the last block executed but this is not always the case. If for example an exception is subsequently caught by an enclosing catch the finally block would not be the last code to be executed.
 8) Checked exceptions must be explicitly declared in a throws clause.
 9) MyClass is not an exception class it is not a subclass of Throwable.
 10) See [StackDemo.java](src/StackDemo.java).
 11) By JVM by an error in the code or by a throw.
 12) Error and Exception
 13) Multi catch allows a single catch block to handle exceptions of more than one type:
 		catch ( ArithmeticException | ArrayIndexOutOfBoundsException e ) {...
 14) No