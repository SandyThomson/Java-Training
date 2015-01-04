### Chapter 8 Self Test

  1) _Using the code from **Try This 8-1**, put the `ICharQ` interface and its
      three implementations into a package called `qpack`. Keeping the queue
      demonstration class `IQDemo` in the default package, show how to import
      and use the classes in `qpack`._

See [QueueDemo.java](src/org/java/training/QueueDemo.java).

  2) _What is a namespace? Why is it important that Java allows you to partition
      the namespace?_

A namespace is a means of organising and naming groups of declarations 
(such as types, functions etc) according to areas of functionality.
Java allows partitioning of the namespace into a hierarchy of packages
to ensure naming collisions are avoided, as well as allowing encapsulation
of declarations (a package can contain many declarations not available
externally, for example).

  3) _Packages are stored in _________._

Directories, where nested packages result in nested directories of the same
name.

  4) _Explain the difference between `protected` and default access._

Default access is more restrictive, allowing access to class members only
within the package the class belongs to. Protected access allows access
within the package as well as to any derived classes.

  5) _Explain the two ways that the members of a package can be used by other
      packages._

By importing the member, e.g. `import org.java.training.qpack.Queue;`, or by
referring to the type with the full package name prefixed:
`org.java.training.qpack.Queue queue = new org.java.training.qpack.LinkedQueue();`.

You can also import multiple symbols from the package with
`import org.java.training.qpack.*;` or import all static members with
`import static org.java.training.qpack.LinkedQueue.*;`.

  6) _"One interface, multiple methods" is a key tenet of Java. What feature best
      exemplifies it?_

The interface.

  7) _How many classes can implement an interface? How many interfaces can a class
      implement?_

Any number of classes can implement an interface. The number of interfaces a class
can implement is conceptually limitless, but the Class File specification limits it
to uint16 (65,535).

  8) _Can interfaces be extended?_

Yes.

  9) _Create an interface for the `Vehicle` class from **Chapter 7**. Call the
      interface `IVehicle`._

See [Vehicle.java](src/org/java/training/Vehicle.java). I refuse to call it
`IVehicle` however; client code shouldn't need to know whether it's an interface
or an abstract or concrete class, so it's meaningless and ugly to encode that
information in the type name itself. Do you see `ISet` for Java library sets?
No, simply [Set](http://docs.oracle.com/javase/8/docs/api/java/util/Set.html), if
they provide natural (sorted) ordering of elements
[SortedSet](http://docs.oracle.com/javase/8/docs/api/java/util/SortedSet.html),
not `ISortedSet`.

 10) _Variables declared in an interface are implicitly `static` and `final`.
      Can they be shared with other parts of a program?_

Sure, just access them as `Type.staticVar` or statically import them.

 11) _A package is, in essence, a container for classes. True or False?_

True.

 12) _What standard Java package is automatically imported into a program?_

`java.lang`.

 13) _What keyword is used to declare a default `interface` method?_

`default`.

 14) _Beginning with JDK 8, is it possible to define a `static` method in an
      `interface`?_

Sure.

 15) _Assume that the `ICharQ` interface shown in **Try This 8-1** has been in
      widespread use for several years. Now, you want to add a method to it
      called `reset()`, which will be used to reset the queue to its empty,
      starting condition. Assuming JDK 8 or later, how can this be accomplished
      without breaking preexisting code?_

You can add a default method to the interface, either fulfilling the functionality,
with the limited exposed behaviour, e.g.:

```java
  default void reset() {
    while(true) {
      try {
        get();
      } catch( BufferUnderflowException e ) {
        break;
      }
    }
  }
```

But then relying on implementations to throw the expected exception in this case
or behave correctly in others, or you can add a default dummy method, either empty
or reporting some error condition:

```java
  default void reset() { /* Implement me... */ }
```

```java
  default void reset() {
    throw new UnsupportedOperationException(
      getClass().getName() + " does not support the `reset' method" );
  }
```

This is far from ideal, breaking the contract of consistent behaviour across implementations
of an interface (i.e. Liskov substitution principle).

 16) _How is a static method in an interface called?_

`InterfaceName.staticMethod();` - the same calling convention for regular public
static methods.
