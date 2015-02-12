1) D I supposed, but does that mean code created before generics was never any of these things?

2) No, you can't use primitives with generics.

3)
```java
public class FlightSchoolSched< T, V > {
	// some code
} 
```

4)
```java
public class FlightSchoolSched< T, V extends Thread > {
	// some code
} 
```

5)
```java
public class FlightSchoolSched< T, V extends T > {
	// some code
} 
```

6) ``?`` is a wildcard, and allows method arguments to include generics that don't specify the type.

7) Wildcards can be bounded.

8)
```java
public <T> T method( T object ) {
    // Do whatever  
    return object;
}
```

9)
```java
public class MyClass<T, V extends T> implements IGenIF<T, V extends T> {
	// What happened to coding?!
}
```

10)
```java
Counter someCount = new Counter( new String("Better than filling in blanks I guess") );
```

11) Type parameters are thrown away by the compiler so are long gone at run time.

12) See the new stack classes.

13) ``<>`` is the diamond operator, which lets you infer type parameters when instantiating new objects. Not nearly
as cool as the diamond operator in Perl obviously.

14) ``MyClass< Double, String > obj - new MyClass<>( 1.1, "Hi" );``