## Java Training - Chapter 7 Self Test

1) _Does a superclass have access to the members of a subclass? Does a subclass have access to the members of a superclass?_

No, and yes. A superclass cannot access members of the subclass, but a subclass does inherit all members of the superclass.

2) _Create a subclass of **TwoDShape** called **Circle**. Include an **area()** method that computes the area of the circle and a constructor that uses **super** to initialize the **TwoDShape** portion._

See Circle.java

3) _How do you prevent a subclass from having access to a member of a superclass?_

Mark the superclass member as private

4) _Describe the purpose and use of the two versions of **super** described in this chapter._

super on its own acts as a call to the constructor(s) of the superclass, while super as prepended to a method or variable is away of accessing the superclass members.

5) _Given the following hierarchy:_

```
class Alpha { ...

class Beta extends Alpha { ...

class Gamma extends Beta { ...
```

_In what order do the constructors for these classes complete their execution when a **Gamma** object is instantiated?_

Alpha, Beta, Gamma

6) _A superclass reference can refer to a subclass object. Explain why this is important as it relates to method overriding._

This allows a common interface between different subclasses e.g. in the TwoDShape example an array of TwoDShapes could exist and we could call area() on each item in the array with each calculated area based on their specific subclass.

7) _What is an abstract class?_

An abstract class is any class containing at least one abstract memember, meaning it has no concrete implementation of its own.

8) _How do you prevent a method from being overridden? How do you prevent a class from being inherited?_

Use the **final** keyword

9) _Explain how inheritance, method overriding, and abstract classes are used to support polymorphism._

By allowing a common class structure to be created, while specific implementation can vary between the subclasses.

10) _What class is a superclass of every other class?_

Object

11) _A class that contains at least one abstract method must, itself, be declared abstract. True or False?_

True

12) _What keyword is used to create a named constant?_

final