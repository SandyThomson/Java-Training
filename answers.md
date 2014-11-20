## Java Training - Chapter 4 Self Test

1) _What is the difference between a class and an object?_

A class is the framework for an object, it contains the variables and methods supported.

An object is an actual instance of a class.

2) _How is a class defined?_

Using the keyword class

3) _What does each object have its own copy of?_

Class variables

4) _Using two separate statements, show how to declare an object called counter of a class call **MyCounter**._

MyCounter counter;
counter = new MyCounter();

5) _Show how a method called **myMeth()** is declared if it has a return type of double and has two int paramaters called a and b._

public double myMeth( int a, int b );

6) _How must a method return if it returns a value?_

"return *value*;"

7) _What name does a constructor have?_

The same name as the class it is constructing

8) _What does **new** do?_

**new** initialises a new object based on a class and returns a reference to it

9) _What is garbage collection, and how does it work? What is **finalize()**?_

Garbage collection is the process by which Java frees up resources by getting rid of unused objects etc. An object is deemed unused if there is no more references to it in the code.

**finalize()** is a special method called immediately preceding an object being deleted by the garbage collector. It gives the program a chance to ensure the object has cleaned up after itself.

10) _What is **this**?_

**this** is a reference to the current object

11) _Can a constructor have one or more parameters?_

Yes, a constructor can handle the same parameters as any other method

12) _If a method returns no value, what must its return type be?_

void