1. A superclass doesn't have direct access to members of a subclass (you could define some sort of abstract getter method perhaps to get around this?).
A subclass has access to all members of a superclass that aren't private.

2. ```java
public class Circle extends TwoDShape {

  private int radius;
  public static final double PI = 3.14;

  public void Circle( int radius ){
     super( radius*2, radius*2);
     this.radius = radius;
  }
  
  @Override
  public double area(){
    return (radius * radius) * PI;
  }
}```

3. Mark it as private

4. Access superclass methods, i.e:
```java
super(x, y, z);
```

Access superclass member variables, i.e
```java
super.x;
```

5. Alpha, Beta, Gamma. The superclass gets constructed first.

6. It basically means the code that references the superclass doesn't need to worry about /what/ particular subclass the reference refers to. 
This means you can build common functionality etc. 

7. An abstract class is a class that cannot be instantiated and must be extended

8. To stop a method from being overridden, you'd mark it as final. Similarly, you'd mark a class as final to stop it being inherited.

9. An abstract superclass can specify abstract methods that *must* be overridden by classes that extend it. 
There can be multiple subclasses that provide different implementations however they can all be assigned to a superclass reference.

This is quite similar to question 6..

10. Object.

11. True

12. final