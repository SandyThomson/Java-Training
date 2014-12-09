# Chapter 7 Answers

1. **Does a superclass have access to the members of a subclass? Does a subclass have access to the members of a superclass?**
   
   * No
   * Yes
   
2. Create a subclass of TwoDShape called Circle...

[Circle.java](src/main/java/Circle.java)

3. **How do you prevent a subclass from having access to a member of a superclass?**

Declare it private.

4. **Describe the purpose and use of the two versions of super described in this chapter.**

```java
/*
 * This can be used to call a constructor of a super class.
 * This has to be used in the first line of the constructor of the subclass.
 */
super( T... args );

/* 
 * This can be used to access the variables of a super class.
 * This will work even if variables with the same name have been declared in the subclass,
 * hiding the super class variables.
 */
super.blarg;
```

5. **Given the following hierarchy:**

```java
class Alpha { ...

class Beta extends Alpha { ...

class Gamma extends Beta { ...
```

**In what order do the constructors for these classes complete their execution when a `Gamma` object is instantiated?**

  i. The `Gamma` constructor will call the `Beta` constructor.
  i. The `Beta` constructor will call the `Alpha` constructor.
  i. The `Alpha` constructor will then complete.
  i. The `Beta` constructor will then complete.
  i. The `Gamma` constructor will then complete.
  i. A `Gamma` object will now be created.
  
6. **A superclass reference can refer to a subclass object. Explain why this is important as it relates to method overriding.**

This is polymorphism, allowing a superclass type to execute subclass specific implementations of methods without having to know exactly which concrete object you currently have.

7. **What is an abstract class?**

A class which is abstract.

This cannot be instantiated, but can contain instance variables and abstract or implemented methods. The point of an abstract class is to hold shared information or methods that would be common to all implementing classes.

8. **How do you prevent a method from being overridden? How do you prevent a class from being inherited?**

To prevent a method or a class from being overridden/inherited, you declare them as `final`.

9. **Explain how inheritance, method overriding, and abstract classes are used to support polymorphism.**

as explained above in 7.

10. **What class is a superclass of every other class?**

`Object`

11. **A class that contains at least one abstract method must, itself, be declared abstract. True or false?**

True. However it can also be declared an interface if there are no concrete implementations in the class.

12. **What keyword is used to create a named constant?**

`final`.