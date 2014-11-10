#### Chapter 3 - Answers

1)  See _CountSpaces.java_.

2)  
```java
if ( <condition> )
	<statement>
else if ( <condition> )
	<statement>
else if ( <condition> )
	<statement>
else 
	<statement>
```

3)  'y > 100'

4)  
```java
for ( int i = 1000; i >= 0; i -= 2 );
```

5)  No.  The 'i' variable is not in scope when attempting to assign to 'count' variable.

6)  The **break** statement forces an immediate exit from a loop bypassing any remaining code and the loop conditional. 
E.g.

```java
for ( String name : names ) {
	if ( "DONE".equals( name ) )
			break;
}
```

It can also be used in the _labelled_ form where it can be a form of **goto** statement:
E.g.

```java
DONE:
	for ( String name : names ) {
		if ( "DONE".equals( name ) )
			break DONE;
	}
```

7)  'after while'.

8)  
```  
0 1 
2 3 
4 5 
6 7 
8 9 
```

9)  
```java
for ( int i = 1; i <= 128; i *= 2 )
	System.out.println( i );
```

10)  See _Convert.java_.

11)  An infinite loop is a loop without a _valid_ terminating condition.

12)  Yes, but it does not need to be the immediately enclosing block. 