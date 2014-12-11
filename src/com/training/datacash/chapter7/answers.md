1) A superclass does not have access to the members of a subclass. A subclass does have access to members of a superclass (unless they are private).

2) See Question2.java

3) You can declare members of a superclass as `private` to prevent the subclasses from accessing them.

4) The two forms of super are `super( params )`, which refers to the constructor of the superclass, and `super.member`, which refers to the members of the superclass.

5) Alpha, Beta, Gamma

6) If a method is overriden in the subclass, then when that method is called on the superclass reference it will call the overriden version as the reference refers to the subclass.

7) An abstract class is a class containing at least one abstract method.

8) You can prevent a method from being overriden and a class from being extended by declaring them as `final`

9) Polymorphism is essentially, "one interface, multiple methods". This means that it should be possble to define a single interface that is the generalized form of a class from which it is possible to call different methods depending on the circumstances. Inheritance allows references to a single class to refer to any of its subclasses, method overriding allows the methods of a subclass to differ from the same method in a superclass and abstract classes allows a generalized interface to be created for a range of subclasses. This all supports polymorphism.

10) `Object` is the superclass of all other classes.

11)  True. A class with at least one abstract method must be abstract.

12) `final` is used to created a constant.