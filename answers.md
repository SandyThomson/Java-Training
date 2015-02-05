# mssw Chapter 12 Answers

## 1. Enumeration constants are said to be *self-typed*. What does this mean?

I didn't really understand this but i think they mean that the type of the enum is the class name that it is contained in.

## 2. What class do all enumerations automatically inherit?

`Enum`

## 3. Given the following enumeration, write a program that uses **values()** to show a list of the constants and their ordinal values.

```java
enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
```

[ToolValuation.java](src/main/java/tools/ToolValuation.java)

## 4. The traffic light simulation developed in Try This 12-1 can be improved with a few simple changes that take advantage of an enumeration's class features. In the version shown, the duration of each colour was controlled by the TrafficLightSimulator class by hard-coding these values into the run() method. Change this so that the duration of each colour is stored by the constants in the TrafficLightColour enumeration. To do this, you will need to add a constructor, a private instance variable and a method called getDelay(). After making these changes, what improvements do you see? On your own, can you think of other improvements? (Hint: Try using the ordinal values to switch light colours rather than relying on a switch statement.)

  * [TrafficLightSimulator.java](src/main/java/traffic/TrafficLightSimulator.java)
  * [TrafficLightDemo.java](src/main/java/traffic/TrafficLightDemo.java)

## 5. Define boxing and unboxing. How does autoboxing/unboxing affect these actions?

Boxing is the art of adding an object wrapper around a primitive type.

Autoboxing will automatically convert a primitive into its associated object wrapper class without the programmer needing to do anything special.

## 6. Change the following fragment so that is uses autoboxing?

```java
Short val = new Short(123);
```

really???

```java
Short val = 123;
```

## 7. In your own words, what does a static import do?


Java	
Static Import

Language Contents
In order to access static members, it is necessary to qualify references with the class they came from. For example, one must say:
double r = Math.cos(Math.PI * theta);
In order to get around this, people sometimes put static members into an interface and inherit from that interface. This is a bad idea. In fact, it's such a bad idea that there's a name for it: the Constant Interface Antipattern (see Effective Java Item 17). The problem is that a class's use of the static members of another class is a mere implementation detail. When a class implements an interface, it becomes part of the class's public API. Implementation details should not leak into public APIs.
The static import construct allows unqualified access to static members without inheriting from the type containing the static members. Instead, the program imports the members, either individually:

import static java.lang.Math.PI;
or en masse:
import static java.lang.Math.*;
Once the static members have been imported, they may be used without qualification:
double r = cos(PI * theta);
The static import declaration is analogous to the normal import declaration. Where the normal import declaration imports classes from packages, allowing them to be used without package qualification, the static import declaration imports static members from classes, allowing them to be used without class qualification.
So when should you use static import? Very sparingly! Only use it when you'd otherwise be tempted to declare local copies of constants, or to abuse inheritance (the Constant Interface Antipattern). In other words, use it when you require frequent access to static members from one or two classes. If you overuse the static import feature, it can make your program unreadable and unmaintainable, polluting its namespace with all the static members you import. Readers of your code (including you, a few months after you wrote it) will not know which class a static member comes from. Importing all of the static members from a class can be particularly harmful to readability; if you need only one or two members, import them individually. Used appropriately, static import can make your program more readable, by removing the boilerplate of repetition of class names.

Copyright &copy; 2004, 2010 Oracle and/or its affiliates. All rights reserved.

## 8. What does this statement do?

```java
import static java.lang.Integer.parseInt;
```

It imports the static java.lang.Integer.parseInt; method.

## 9. Is static import designed for special case situations, or is if good practice to bring all static members of all classes into view?

its not good practice to import all static members into your class as it will pollute the namespace. Ideally you would only import static members that you use very frequently throughout your class. It would also be best to import each method individually so that it is clear where the method is coming from.

## 10. An annotation is syntactically based on a/an \_\_\_\_\_\_\_\_\_\_\_

For this and the next few answers, please [buy my book](xtra-answers.md): *Java: The Complete Answers, Twelfth Edition* (Prophet Newspaper/Wambeek Home Edition, 2015)
