# MCM Java Training Chapter 7 Answers

**Q1**: A superclass does not have access to the members of a subclass (unless they are overriden versions of the superclass's members). A sub class does have access to members of its superclass given providing they are not defined with the private access modifier.

**Q2**: See Ellipse.java

**Q3**: Using the private access modifier restricts access to members of a superclass

**Q4**: The purpose of the two version of super are:
* To initiate the constructor of the super class, by using `super()` in the subclass's constructor
* To access members of the super class, by using `super().membername`

**Q5:**: Constructors will complete execution in the following order: Alpha, Beta, Gamma

**Q6**: This is important as subclasses can be substituted in a reference to their superclass, this can modify the behaviour of an application at runtime when methods have been overridden.

**Q7**: An abstract class is a specification class which contains some functionality but cannot be instantiated as of itself. Instead it should be extended by an implementing class and required methods overriden. It can be thought of as like an interface that includes some functionality, although there are key differences as sub classes extend rather than implement abstract classes.

**Q8**: Use of the final keyword prevents a method being overriden or a class from being inherited

**Q9**: Inheritance, method overriding and abstract classes (among other things), support polymorphism by allowing subclasses to be substituted for other classes in the same inheritance tree, therefore dynamically changing behaviour depending on which subclass is being used. I.e., the behaviour of the getArea() method in a Triangle, or Circle class would behave very differently but could be called in the same context by referring to their parent object (i.e., TwoDShape()) rather than directly to the sub objects.

**Q10**: All classes are subclasses of the Object class. Therefore all the methods defined in the Object class can be used by all classes in Java, and can be referred to as type Object.

**Q11**: True

**Q12**: The final keyword is used to create a named constant
