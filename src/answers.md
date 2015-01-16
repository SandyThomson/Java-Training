### Chapter 7 Self Test

1a) Does a superclass have access to the members of a subclass? 

	No.

1b) Does a subclass have access to the members of a superclass?

	Yes.

2) Create a subclass of **TwoDShape** called **Circle**. Include an **area()** method that computes the area of the circle and a constructor that uses **super** to initialize the **TwoDShape** portion.

	See [CircleDemo.java](CircleDemo.java)

3) How do you prevent a subclass from having access to a member of a superclass?

	Declare the member as **private** within the superclass

4) Describe the purpose and use of the two versions of **super** described in this chapter.

	super(<params>) calls the superclass constructor.
	
	super.<method> calls a superclass method this is useful give access to a superclass method or variable which is overridden in the subclass.
	
5) Given the following hierarchy:

```
class Alpha { ...

class Beta extends Alpha { ...

class Gamma extends Beta { ...
```

In what order do the constructors for these classes complete their execution when a **Gamma** object is instantiated?

	Alpha
	Beta
	Gamma

6) A superclass reference can refer to a subclass object. Explain why this is important as it relates to method overriding.

	When a method call is made on a superclass reference which points to a sub class object only the methods and variables present in the superclass can be accessed however they will be overridden by the subclass.
	
7) What is an abstract class?

	An abstract class does not completely define all of its methods and therefore cannot be instanciated. Anabstract class must be extended in order to provide a fully defined class which can be instanciated. 
	
8) How do you prevent a method from being overridden? How do you prevent a class from being inherited?

	Add the keyword final to the definition of the method or class.
	
9) Explain how inheritance, method overriding, and abstract classes are used to support polymorphism.

	It allows a common structure to be created in the superclass, while the subclasses are free to override and change the behaviour of the superclass to give unique behaviour for each type of subclass.

10) What class is a superclass of every other class?

	Object

11) A class that contains at least one abstract method must, itself, be declared abstract. True or False?

	True

12) What keyword is used to create a named constant?

	final

