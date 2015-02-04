1) self-typed means that the constants are typed by the enumeration that defines them.

2) All enumerations automatically inherit `java.lang.Enum`

3) 
```java
Tools[] tools = Tools.values();
for ( Tools tool: tools ) {
  System.out.println( "Tool " + tool + ", with ordinal value " + Tool.getValue(tool) );
}

```

4) See Question4.java

5) Boxing and unboxing involve turning a primitive into its object containing the same value ( i.e. int -> Integer) and vice-versa. Auto-un/boxing causes these to take place automatically under certain conditions such as apply a primitive operator to an object.

6) 
```java
Short val = 123;
```

7) Static import brings imported static methods into the local namespace so that they can be called without needing to include the class in the method call.

8) The statement imports the `parseInt` method so it can be used without having to include `Integer`. For example:
```java
int i = parseInt("123");
```

9) Static import should only be used for special-case situations, as bringing in too many static imports can fill up the namespace with method names and make it very ambiguous what any given method call is actually doing.

10) An annotation is syntacically based upon an interface.

11)A marker annotation is an annotation without any parameters that is used to flag an item as having some attribute, i.e. `@Override`

12) False, annotations can also be applied to classes, parameters, fields, and enums.
