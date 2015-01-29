#### Chapter 12 Self Test Answers

1)  _Self-Typed_ means that the enumeration constants type is the type of the enumeration in which they are declared.  E.g.
```java
enum Day {
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```
This means the type of the constants in this enum is ```Day```.

2)  **java.lang.Enum**.

3)  See [ValuesDemo.java](src/com/selftest/ValuesDemo.java)

4)  See [TrafficLightDemo.java](src/com/selftest/TrafficLightDemo.java) and _related_ classes.

5)  **Boxing** is the conversion of a primitive type to the corresponding _Type_ _Wrapper_ object and **Unboxing** is the reverse.  **Autoboxing**/**Autounboxing** affects these actions by performing this automatically allowing code to be simplified.

6)
```java
Short val = 123;
```  

7)  Static import allows you to import static members of a class or interface which, again, can simplify and streamline code as the member can be called without the class prefix.

8)  It imports the _parseInt_ static method from the _Integer_ class into the global namespace.

9)  It is designed for special cases as overuse of this could increase the risk of namespace conflicts.

10)  an **interface**

11)  A _marker_ _annotation_ is an annotation which does **not** have parameters.  They are used to mark an item with an attribute.

12)  False.