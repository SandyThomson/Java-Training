#### Chapter 4 - Self Test Answers

1) A class is a template that defines the form of an object (state and behaviour). An object is a physical representation of the class template in memory.

2) A class is defined using the **class** keyword.  
E.g.

```java
public class Foo {
}
```

3) Each object has a copy of the member variables defined in the class.

4)

```java
MyCounter counter;
counter = new MyCounter();
```

5)

```java
double myMeth( int a, int b ) {
}
```

6) Using the keyword **return** in the general form '_return value_'.
E.g.

```java
int sum( int a, int b ) {
	return a + b;
}
```

7) The constructor has the same name as the class but no _explicit_ return type.
E.g.

```java
class Foo {

  Foo() {
  }
  
}
```

8) The **new** keyword creates an instance of a given class type by allocating memory and returning a reference to the newly created object as defined by the class template.

9) Garbage collection is the method of re-claiming memory assigned to objects which are no longer needed (e.g. objects to which no references exist). The **finalize()** method, if defined in a class, will be called just before an object is destroyed.

10) The **this** keyword is an implicit argument to class methods which will hold a reference to object upon which the method is called.

11) Yes. 

12) _void_.   