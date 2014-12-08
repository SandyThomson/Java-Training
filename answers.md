1. A superclass cannot access members of a subclass as it has no record of them. A subclass
can access members of its superclass, following any access permissions as normal.

2. See Circle.java

3. Declare the member private.

4. ``super`` can be used as a method to provoke that superclass' constructor, or as an object to
access any available members.

5. The constructors would run in Alpha, Beta, Gamma order.

6. The ability to use a superclass reference to a subclass object allows overridden methods to be
resolved at run time.

7. An abstract class provides the definition of an object but cannot be instantiated directly and must be sub-classed.

8. Prefix their declaration with ``final``.

9. Inheritance can allow generalised or abstract classes to be combined with method overriding to allow the
'one interface, multiple methods' approach of polymorphism, allowing generalised behaviour to be specified in
superclasses and them implemented in detail in subclasses by defining which methods are required.

10. Object.

11. True.

12. ``final`` 