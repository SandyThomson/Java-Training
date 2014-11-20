## Chapter 4 Self Test

 1) _What is the difference between a class and an object?_
 
 A class defines the contained types, layout, and operations that can be performed on class 
 instances (the book uses the term _template_, which is reasonable, but unnecessarily confuses
 it with the template metaprogramming concept in languages like C++).
 
 An object is an _instance_ of a class (where per-instance state is allocated in
 memory). It should be noted that in Java classes can also have instantiable state (static
 members); unlike instances, these are allocated at _class load time_.
 
 2) _How is a class defined?_
 
 ```java
 <access modifier|default> <abstract?> class <ClassName> <Generic parameters?> <extends|implements? SomeOtherClass> {
   //...
 }
 ```
 
 For example:
 
 ```java
 public class Kitteh {}
 ```
 
 Or for more complex classes:
 
 ```java
 public abstract class Convoluted<T extends Thing> extends SimplerBase implements Function<T, String>, Callable<T> {}
 ```
 
 3) _What does each object have its own copy of?_
 
 All non-static member variables defined in the class (or base class).
 
 4) _Using two separate statements, show how to declare an object called `counter` of a class called `MyCounter`_
 
 ```java
 MyCounter counter;
 counter = new MyCounter(1);
 ```
 
 5) _Show how a method called `myMeth()` is declared if it has a return type of `double` and has two `int`
   parameters called a and b._
   
```java
  public double myMeth( int a, int b ); 
```
 
 6) _How must a method return if it returns a value?_
 
 It must explicitly define `return <type>;` statements wherever control would be returned to the caller. The
 one exception to this is, well, throwing exceptions.
 
 7) _What name does a constructor have?_
 
 The identifier of the class it belongs to.
 
 8) _What does `new` do?_
 
 Creates an instance of a type by dynamically allocating memory, then calling the supplied constructor for
 the type, returning a reference to the newly allocated instance. In some circumstances it'll throw a
 runtime exception (e.g. `OutOfMemoryError`).
 
 9) _What is garbage collection, and how does it work? What is `finalize()`?_
 
 Garbage collection is a means some languages employ of cleaning up dynamically allocated memory for reuse
 (languages that don't trust the programmer to properly employ RAII techniques and clean up memory when it's
 actually no longer needed as opposed to, say, whenever).
 
 Techniques vary from simple reference counting (ref descoping decrements a ref count, when it hits zero it
 cleans up the memory) to more complex mark and sweep techniques, generational garbage collection etc.
 
 `finalize` is a method that gets called on an instance when it's eligible for garbage collection but prior
 to collection. It can be used to clean up resources owned by the instance, or more dangerously to cause
 the instance to become ineligible for collection (_~back from the dead~_).
 
 It should be noted that whilst Java handles memory automatically, this is not so for various other resources
 (file handles, database connections, socket connections, basically any other resource with a concept of
 ownership) - here Java _does_ employ RAII with the `AutoCloseable` interface, and notably the new 
 `try-with-resources` semantics:
 
 ```java
 try ( AudioInputStream au = new AudioInputStream(new FileInputStream("musiiiiic.wav"), format, len) ) {
   // Play WAV file...
 }
 ```
 
 Note that the `AudioInputStream` is closed when descoped from the try block, the `close` method is called,
 cascades through the decorated `InputStream`s and releases the file handle.
 
 10) _What is `this`_
 
 A reference to the instance being operated on - this is implicitly passed in as the first parameter to
 instance methods.
 
 11) _Can a constructor have one or more parameters?_
 
 Yes.
 
 12) _If a method returns no value, what must its return type be?_
 
 `void`
 