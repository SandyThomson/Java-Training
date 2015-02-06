### Chapter 12 Self Test

1) _Enumeration constants are said to be self-typed. What does this mean?_

This means that an enumeration constant's type is that of the enumeration object. 

2) _What class do all enumerations automatically inherit?_

**Enum**

3) _Given the following enumeration, write a program that uses **values()** to show a list of constants and their ordinal values._

```
enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
```

[Tools](../src/chapter12/ToolsDemo.java)

4) _The traffic light simulation developed in **Try This 12-1** can be improved with a few simple changes that take advantage of an enumeration's class features. In the version shown, the duration and each color was controlled by the **TrafficLightSimulator** class by hard-coding these values into the **run()** method. Change this so that the duration of each color is stored by the constants in the **TrafficLightColor** enumeration. To do this, you will need a constructor, a private instance variable, and a method called **getDelay()**. After making these changes, what improvements do you see? On your own, can you think of other improvements? (Hint: Try using ordinal values to switch light colors rather than relying on a switch statement.)_

[TrafficLightSimulator](../src/chapter12/TrafficLightSimulator.java)

5) _Define boxing and unboxing. How does autoboxing/unboxing affect these actions?_

boxing is the process of turning a primitive data type into an instance of its wrapper class (e.g. int to Integer), while unboxing is the reverse.

Autoboxing/unboxing than allow us to perform these transformations more easily, and with less code required.

6) _Change the following fragment so that it uses autoboxing._

`Short val = new Short(123);`

`Short val = 123;`

7) _In your own words, what does static import do?_

Brings a static member into the global namespace meaning they do not have to be referred to by their class/interface/whatever.

8) _What does this statement do?_

`import static java.lang.Integer.pareseInt;`

Brings parseInt into the global namespace meaning we can refere to it without the "Integer." part.

9) _Is static import designed for special-case situations, or is it good practice to bring all static members of all classes into view?_

Special-case situations

10) _An annotation is syntactically based on a/an                     ._

Interface

11) _What is a marker annotation?_

An annotation that takes no arguments.

12) _An annotation can be applied only to methods. True or False?_

False.