### Chapter 12 Self Test

  1) _Enumeration constants are said to be **self-typed**. What does
      this mean?_

Enumeration constants are typed by their enclosing class. For example,
in the enum:

```java
enum Creature {
	PLAYER, NPC, MONSTER
}
```

`MONSTER` is of the type `Creature`.

  2) _What class do all enumerations automatically inherit?_

`java.lang.Enum`.

  3) _Given the following enumeration, write a program that uses `values()`
      to show a list of the constants and their ordinal values._

```java
enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
```

```java
Arrays.stream(Tools.values()).forEach(
	t -> System.out.printf("%s: %d%n", t.name(), t.ordinal()) );
```

  4) _The traffic light simulation developed in **Try This 12-1** can be
      improved with a few simple changes that take advantage of an enumeration's
      class features. In the version shown, the duration of each color was
      controlled by the `TrafficLightSimulator` class by hard-coding these
      values into the `run()` method. Change this so that the duration of each
      color is stored by the constants in the `TrafficLightColor` enumeration.
      To do this, you will need to add a constructor, a private instance
      variable, and a method called `getDelay()`. After making these changes,
      what improvements do you see? On your own, can you think of other
      improvements? (Hint: Try using ordinal values to switch light colors
      rather than relying on a `switch` statement.)_

See [TrafficLightDemo](src/org/java/training/TrafficLightDemo.java).

  5) _Define boxing and unboxing. How does autoboxing/unboxing affect these
      actions?_

Boxing is a mechanism for wrapping Java primitives in Objects to provide OO
features and allow primitives to be used in Java's limited attempt at generic
programming. Unboxing is the process of getting a primitive value from a boxed
Object reference. Autoboxing/unboxing affects these by removing the boilerplate
associated with these conversions, making them usable.

  6) _Change the following fragment so that it uses autoboxing._

```java
Short val = new Short(123);
```

```java
Short val = 123;
```

  7) _In your own words, what does static import do?_

It imports the static members of a namespace into another namespace.

  8) _What does this statement do?_

```java
import static java.lang.Integer.parseInt;
```

It imports the `Integer.parseInt` static method into the current namespace, allowing
it's use without accessing via the owning namespace/class declaration,
e.g. `int x = parseInt("12");`.

  9) _Is static import designed for special-case situations, or is it good practice to
      bring all static members of all classes into view?_

Bit of a loaded question, but no, it is not good practice to bring all static members
into view. One other use of static imports not discussed in this chapter is to simplify
usage of nested members of the current namespace, for example:

```java
import static org.this.namespace.Entity.State.*;

class Entity {
	enum State { ACTIVE, SUSPENDED, BROKEN }
	
	public State selectState() {
		if ( systemsRunning() ) return ACTIVE;
		else if ( !diagnosticSuccess() )  return BROKEN;
		return SUSPENDED;
	}
}
```

Here, we don't have to reference each constant as, e.g. `State.ACTIVE`.

 10) _An annotation is syntactically based on a/an ______.

`interface`.

 11) _What is a marker annotation?_

An annotation without members, for example `@interface BadCode {}`.

 12) _An annotation can be applied only to methods. True or False?_

False, annotations can be applied to methods, classes, class/instance variables,
arguments, return types, other annotations - you name it.