1. A class is an abstract definition of an object. An object is an instance of a class.

2. A class is defined with the ``class`` keyword.

3. Objects have their own copies of any class attributes, as long as they're not static.

4. ``MyCounter counter; counter = new MyCounter();``
``MyCounter counter = new MyCounter();``

5. ``double myMeth() ( int a, int b ) {}``

6. The return statement can be used to return a value from a method.

7. Constructors have the same name as the class containing them.

8. ``new`` calls the constructor of a class.

9. Garbage collection frees up memory used by objects when they go out of scope or there are no more
references to them. ``finalize`` is a method that can be added to a class to perform some action when
an object is being destroyed.

10. ``this`` is used to refer to the class variables and methods of an object in the event of any ambiguity 
between the names of local and class variables.

11. Constructors can have as many parameters as you like.

12. A method that returns no values must be type ``void``.