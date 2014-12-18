## Java Training - Chapter 8 Self Test

1) _Using the code from Try This 8-1, put the **ICharQ** interface and its three implementations into a package called **qpack**. Keeping the queue demonstration class **IQDemo** in the default package, show how to import and use the class in **qpack**._

See IQDemo.java

2) _What is a namespace? Why is it important that Java allows you to partition the namespace?_

A namespace is a "region" for your code to live, that can be used to organise your code and prevent naming collisions.

3) _Packages are stroed in ____________________________._

Folders/Directories

4) _Explain the difference between **protected** and default access._

**protected** will allow access from sub-classes outside of the current package, default access will not.

5) _Explain the two ways that the members of a package can be used by other packages._

Using its fully qualified name, or by importing it to the current class first.

6) _"One interface, multiple methods" is a key tenet of Java. What feature best exemplifies it?_

I am assuming they mean Interface best exemplifies this.

7) _How many classes can implement an interface? How many interfaces can a class implement?_

As many as you like and as many as you like

8) _Can interfaces be extended?_

Yep

9) _Create an interface for the **Vehicle** class from Chapter 7. Call the interface **IVehicle**._

See IVehicle.java

10) _Variables declared in an interface are implicitly **static** and **final**. Can they be shared with other parts of a program?_

Yes

11) _A package is, in essence, a container for classes. True or False?_

True

12) _What standard Java package is automatically imported into a program?_

**java.lang**

13) _What keyword is used to declare a default **interface** method?_

**default**

14) _Beginning with JDK 8, is it possible to define a **static** method in an **interface**?_

Yes

15) _Assume that the **ICharQ** interface shown in Try This 8-1 has been in widespread use for several years. Now, you want to add a method to it called **reset()**, which will be used to reset the queue to its empty, starting condition. Assuming JDK 8 or later, how can this be accompolished without breaking preexisting code?_

Introduce **reset()** to the interface with a default implementation

16) _How is a **static** method in an interface called?_

_interfaceName.method()_