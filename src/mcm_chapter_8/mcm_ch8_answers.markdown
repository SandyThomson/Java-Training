# MCM Chapter 8 Answers

**Q1**: See IQDemo.java, etc.

**Q2**: A namespace defines a "declarative region". No two classes can share the same namespace, so that a mechanism is provided for creating libraries etc that do not clash with those of other developers, or the standard Java namespace etc.

**Q3**: Packages are stored in their own directories.

**Q4**: Protected access is where member objects are accessible by subclasses or by classes in the same package. Default access is where members are only available to the class itself and other classes in the package, but not to sub classes.

**Q5**: Members of a package can be used by classes in another package either by importing the package:

	import packagename.*;

Importing the specific classes of that package that are required:

	import packagename.classname;

Or by referring directly to the package name in the class:

	packagename.classname ref = new packagename.classname();
	
**Q6**: The feature that best exemplifies *One Interface, many methods* is the ability to refer to an implementing class as a type of the interface e.g.:
	
	ICharQ queue = new FixedQueue;
	
	ICharQ queue2 = new DynQueue
	
	//Reassging queue1 to be queue2, so we can substitute in a different type
	queue = queue2;
	
This allows us to use multiple implementations in the same context, and allows us to swap in different implementations of an interface as we please, which will perform different behaviour.

**Q7**: Many classes can implement an interface, Classes can implement many interfaces.

**Q8**: An interface can extend another interface, but classes cannot extend interfaces.

**Q9**: See **vehicle** package

**Q10**: They can be accessed statically but not updated as they are constants.

**Q11**: True

**Q12**: java.lang is imported automatically

**Q13**: default, i.e.:

	default void doSomething();

**Q14**: Yes, as of JDK 8, static methods can be defined in an interface.

**Q15**: You would declare reset() as a default method, with some default functionality to be run if a class was not to implement it, so as not to break existing functionality.

**Q16**: As follows:

	static int getAStaticInt(){
		return 2;
	}
	

