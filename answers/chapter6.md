1. The code is not valid as the count member is private (therefore inaccessible outwith the class)
 
2. An access modifier must *precede* a members declaration

3. See Stack.java and StackTest.java

4. See ExampleObject.java and SwapTest.java

5. The fragment is not correct, as the method signatures are identical (note that return types do not form part of a method signature)

6. See StringBackwards.java and StringBackwardsTest.java

7. If you need to define a *global* variable (which is what I /think/ this question is asking), you'd mark the variable as static

8. A static block is ran first in a class, so can be used to initialise things, for example

9. An inner class is a class declared within another class

10. private

11. signature

12. call-by-value (for primatives). call-by-reference is used for objects.

13. See VarargsTest.java

14. Yes

15. ```java
public void sum( int id, int... values );
public void sum ( int... values);
```