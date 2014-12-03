1. The second fragment would not work as it attempts to access a private member in the X class.

2. An access modifier must _precede_ a member's declaration.

3. See Stack.java

4. 

    ```java
    void swap ( Test a, Test b ) {
      Test tmp;
      
      tmp = a;
      a = b;
      b = tmp;
    }
    ```

5. The fragment isn't correct as the two methods have the same name
and arguments. Return type can't be used to distinguish them.

6. See ReverseString.java

7. The variable would be *static*

8. A static block might be used in object initialisation.

9. An inner class is a class defined within another, which will be only available in the enclosing class.

10. *private* is used to make a class member only available within that class.

11. A method's name plus parameter list is known as a *signature*.

12. Call-by-*value*

13. See Args.java

14. Varargs methods can be overloaded, provided that any varargs parameters are last in the parameter list
and that any preceding arguments are not the same type as the varargs parameter.

15.
    ```java
    void method ( int i, int ... varargs ) {}
    ```
