#### Chapter 6 Self Test

1) No. The _count_ member variable is declared with the **private** access modifier so it is not accessible outside of it's class.

2) An access modifier must **begin** a member's declaration. E.g.
```java
private int count;
```

3) See [Stack.java](./src/com/selftest/Stack.java)

4) See [Swap.java](./src/com/selftest/Swap.java)

5) No.  Method overloading requires more than the _return type_ to be different between methods with the same name.

6) See [Recurse.java](./src/com/selftest/Recurse.java)

7) Using the **static** keyword.

8) Static blocks are used when a class requires some kind of initialisation before objects/instances are created.

9) An _inner class_ is a class which is declared in a non-static manner within another class.

10) **private**

11) _signature_

12) _call-by-value_

13) See [Sum.java](./src/com/selftest/Sum.java)

14) Yes.

15) 
```java
public int sum( int ... values ) { ... }
```

and

```java
public int sum( int value, int ... values ) { ... }
```