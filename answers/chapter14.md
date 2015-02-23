  1. The lambda operator is `->`
  
  2. Erm, a functional interface is an interface the defines only one method
  
  3. A lambda expression implements a functional interface, where that interface defines a single method (Single Absract Method - SAM)
  
  4. Expression lambdas (single expression lambdas) and block lambdas (multiple expression lambdas)
  
  5. See QuestionFive.java
  
  6. See QuestionSix.java
  
  7. See QuestionSeven.java
  
  8. See QuestionEight.java
  
  9. See QuestionNine.java
  
  10. Lambda expressions can use a local variable, but that variable is effectively final (it cannot change inside or outwith the lambda expression).
  Declaring it final would probably be a good shout.
  
  11. True. Thrown checked expressions must be defined in the functional interface - the same as all other interfaces.
  
  12. A method reference provides the means to refer to a method without actually executing it.
  
  13. When evaluated, a method reference creates an instance of the **functional interface** supplied by its target context
  
  14. MyClass::myStaticMethod
  
  15. mcObj::myInstMethod
  
  16. See QuestionSixteen.java and MyIntNum.java
  
  17. ClassName::new
  
  18. java.util.function