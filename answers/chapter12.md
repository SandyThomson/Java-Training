  1. The constants in an Enumeration have the type of the enumeration itself.
  
  2. java.lang.Enum?
  
  3. ```java
  	@Test
	public void TestTools() {
		for (Tools t : Tools.values()) {
			System.out.println("Enum value:" + t.toString());
			System.out.println("Ordinal value: " + t.ordinal());
		}
	}
	```

  4. See trafficlight package (note: I did this _before_ reaching the self test questions).
  
  5. Boxing is wrapping a Java primitive (e.g) int in a Java object (e.g Integer). Unboxing is the reverse (i.e extracting a primitive from a Object type)
  Autoboxing/unboxing automates this tedious process, so an int can be used where an Integer is specified, and vice versa without needing calls like `new Integer(11)` or `intObj.intValue()`.
  
  6. `Short val = 123;`
  
  7. Static import allows you to import static methods and values which can make your code more readable (as including the class name every time for a frequently used static method is bothersome).
  
  8. The method imports the parseInt static method from the integer class, so instead of having to type:
  ```java
  Integer.parseInt(x);
  ```
  you can type
  
  ```java
  parseInt(x);
  ```
  
 making your code potentially more readable, especially when used repeatedly.
 
 9. You generally want to use static import to cut down on clutter. If it's a one off use you probably don't need to bother.
 You can run into collisions, however from memory the compiler will alert you to this fact and force you to fully qualify the use.
 
 10. An annotation is syntactically based on a/an interface
 
 11. A marker annotation is one that contains no values (e.g @Expose, @Deprecated, @Override etc)
 
 12. An annotation can be applied to Classes, Methods and Class variables. Java 8 might have extended this, although I didn't really understand what the book meant here.