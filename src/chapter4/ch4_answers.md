## MCM Java Training Chapter 4 Answers

**Q1: What is the difference between a class and an object?**

A class is a definition of a new data type, and an object defines and instance of a class.

**Q2: How is a class defined?**

A class is defined using the *class* keyword, e.g. as follows (with a constructor and an example method):

	class ExampleClass{
		
		String aParam;
	
		public ExampleClass(String aParam){
			//Assign instance variable, not use of this
			this.aParam = aParam;
		}
		
		public String getParam(){
			return this.aParam;
		}	
	}
	
**Q3: What does each object have its own copy of?:**

Each object has its own copy of the instance variables that are defined within the class definition.

**Q4: Using two seperate statements, show how to declare an object called counter of a class called myCounter:**

	MyCounter counter;
	counter = new MyCounter();
	//Or
	MyCounter counter = new MyCounter();
	
**Q5: Show how a method called myMeth() is declared if it has a return type of double and has two in parameters called a and b:**

	[public | private | protected] double myMeth(int a, int b){
		return a+b;
	}
	
**Q 6: How must a method return if it retuerdns a value?**

Using the return statement (see Q5).

**Q7: What Name does a constructor have?:**

A constructor must have the name of its class. It can also have multiple parameters, and class can have multiple constructors, but the name always has to be that of the class.

**Q8: What does new do?:**

New instantiates a new object of a given class.

**Q9: What is garbage collection and how does it work? What is finalize()?:**

Garbage collection in Java is where the JVM clear up unused objects to free up allocated memory that is no longer being used. Garbage collection works by destroying any objects in memory that no longer have a reference variable pointing at them (e.g., if the reference variable has gone out of scope, etc). Garbage Collection is done intermittently by the JVM and does not need to be manually instantiated (although running *System.gc()* will suggest to the JVM that Garbage Collection should be run.

Because Garbage collection is intermittent there can be no guarantee of when it will be called. The finalize method is designed to be run when an object is destroyed by the Garbage collector, however it needs careful use as we can't guarantee when it will be run. It can be useful for things such as closing resources being used by that object, etc.

**Q10: What is this?:**

The *this* keyword is a reference to the object itself, and can be used to access instance variables and methods in the object. This is not massively useful in basic classes, but can be very useful later on when we get to inheritance as it can be used to refer to the object itself, while other keywords (e.g., super) can be used to refer to superclasses, etc..... I'm sure there'll be more on this later though.

**Q11: Can a constructor have one or more parameters?:**

Yes, a constructor can have many or no parameters, and we can also have multiple constructors in a class.

**Q12: If a method returns no value, what must its return type be?:**

In this case the return type must be void, e.g.:

	public void doSomething(){
		//Do something but don't return anything.
	}


