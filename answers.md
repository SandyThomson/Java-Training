#### Chapter 7 Self Test Answers

1) No.  Yes, the subclass does have access to members of the superclass but only the _public_ and _protected_ members.

2) See [Shapes.java](./src/com/selftest/Shapes.java)

3) The member should be declared with the **private** access modifier.

4) The two uses of **super** are:
* call the constructor of the superclass from a subclass
```java
super( 1, 2, 3 );
```
* access a member from the superclass from a subclass
```java
super.name;
```

5) _Alpha_, _Beta_ then _Gamma_.

6) When a overridden method is called on a superclass reference the subclass version will be executed.

7) An **abstract** class is a class which contains at least _one_ abstract method.  It is often used to define common fields and/or behaviour and cannot be instantiated directly. 

8) Declare both as **final**.

9) _Inheritance_, _method overriding_ and _abstract classes_ are used to support _polymorphism_ by allowing the user to create a common interface which can be implemented by many subclasses.  The reference to just the superclass can, therefore, refer to many possible implementations.

10) Object.

11) True.

12) **final**.  