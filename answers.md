### Chapter 7 Self Test

  1) _Does a superclass have access to the members of a subclass? Does a subclass have
      access to the members of a superclass?_

No. A subclass does have access to the `public` and `protected` members of a superclass,
however.

  2) _Create a subclass of `TwoDShape` called `Circle`. Include an `area()` method that
      computes the area of the circle and a constructor that uses `super` to initialize
      the `TwoDShape` portion._

See [CircleDemo](src/org/java/training/exercises/CircleDemo.java).

  3) _How do you prevent a subclass from having access to a member of a superclass?_

Apply the `private` access modifier to the member.

  4) _Describe the purpose and use of the two versions of **super** described in this
      chapter._

`super` can be used to explicitly call a superclass constructor, when declared as the
first statement in a derived classes constructor. For no-arg super constructors this is
implicit.

`super` can also be used to refer to members of a super type when member shadowing (for
variables) or method overloading (for methods) has occurred.

  5) _Given the following hierarchy:_
  
```java
class Alpha { ...

class Beta extends Alpha { ...

class Gamma extends Beta { ...
```

  _In what order do the constructors for these classes complete their execution when a
   `Gamma` object is instantiated?_

The most base type is instantiated followed the next base down the hierarchy. In this
case `Alpha` is instantiated, followed by `Beta`, finally `Gamma`.

  6) _A superclass reference can refer to a subclass object. Explain why this is important
      as it relates to method overriding._
      
This allows single dynamic-dispatch (that is, polymorphism where the run-time type of the
hidden `this` operand is used to determine the specific method to call). It allows different
types implementing the superclass type's _interface_ to be used as if it were the base type.

This is usually implemented in OO languages such as Java, by including an inaccessible (to the
programmer) field of each instance that is a pointer to class data, including a table of pointers
to functions to dispatch to (the _vtable_ or _Virtual Function Table_). When the base reference
dereferences the pointer to class data held by the instance referred to, it is able to dispatch
to a different method depending on the run-time type of the instance.

  7) _What is an abstract class?_

A class that cannot be instantiated, and may have 0 or more methods defined as abstract. These do
not supply an implementation, instead requiring concrete subtypes implement any abstract methods.

  8) _How do you prevent a method from being overriden? How do you prevent a class from being
      inherited?_

In both cases, the `final` keyword. To ensure a method cannot be overriden, the `final` modifier
must be applied to the method declaration; to avoid a class being inherited, it must be applied
to the class:

```java
final class Immutable {
  final int data;
  public Immutable(int data) { this.data = data; }
  public int apply(int x) { return data * x; }
}

class Etc {
  /* We don't want anyone to redefine the meaning of life calculation */
  final int meaningOfLife() { return 42; }
}
``` 

  9) _Explain how inheritance, method overriding, and abstract classes are used to support
      polymorphism._

Inheritance allows multiple types to be operated on as part of a single interface. Method overriding
is used to allow subtypes to implement behaviours specific to their type that can still be accessed
through the interface of their supertype, and is thus the OO way of implementing single dynamic
dispatch (see #6). Abstract classes allow some parts of an interface to be implemented, whilst delegating
certain methods to a more concrete type.

 10) _What class is a superclass of every other class?_

`Object`.

 11) _A class that contains at least one abstract method must, itself, be declared abstract. True or False?_
 
True.

 12) _What keyword is used to create a named constant?_
 
`final`.
