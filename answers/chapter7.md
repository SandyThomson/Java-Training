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