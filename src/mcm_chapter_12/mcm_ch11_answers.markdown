# MCM Chapter 12 Answers

**1. Enumeration constants are said to be self-typed. What does this mean?**

This means that they are objects of the type of the enum where they are defined, and do not have to be declared as new.

**2. What class do all enumerations automatically inherit?**

java.lang.enum

**3. Given the following enumeration, write a program that uses values( ) to show a list of the constants and their ordinal values.**

```java
enum Tools {
SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
```

See [ToolsDemo.java](ToolsDemo.java)


**4. The traffic light simulation developed in Try This 12-1 can be improved with a few simple changes that take advantage of an enumeration’s class features. In the version shown, the duration of each color was controlled by the TrafficLightSimulator class by hard-coding these values into the run( ) method. Change this so that the duration of each color is stored by the constants in the TrafficLightColor enumeration. To do this, you will need to add a constructor, a private instance variable, and a method called getDelay( ). After making these changes, what improvements do you see? On your own, can you think of other improvements? (Hint: Try using ordinal values to switch light colors rather than relying on a switch statement.)**




**5. Define boxing and unboxing. How does autoboxing/unboxing affect these actions?**

Boxing and unboxing is the act of wrapping / unwrapping a primitive in an object (e.g., wrapping an int in an Integer object). Autoboxing / autounboxing, does this automatically for specific primitive / object mappings so that for example, and int primitive can be assigned to an an Integer object as so:

```java
	Integer intVal = 1;
	
```

**6. Change the following fragment so that it uses autoboxing.**
**Short val = new Short(123);**

```java
	Short val = 123;
```

**7. In your own words, what does static import do?**

A static import, allows static methods to be used in a class without referring to their parent class.

**8. What does this statement do?**
**import static java.lang.Integer.parseInt;**

This is a static import of the parseInt() method, and this allows this method to be referred to as just parseInt() and not Integer.parseInt();


**9. Is static import designed for special-case situations, or is it good practice to bring all static members of all classes into view?**

Maybe not special case, but care needs to be taken to avoid namespace issues. Shouldn't really be used to bring all static members of classes into view.

**10. An annotation is syntactically based on a/an ________________ .**

Metadata?

**11. What is a marker annotation?**

An annotation without a parameter

**12. An annotation can be applied only to methods. True or False?**

false
