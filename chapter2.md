# 1 #
To help prevent errors and enhance reliability

# 2 #
It defines a character, and os 16 bit to support unicode characters

# 3 #
false

# 4 #
```java
System.out.println("One\nTwo\nThree");
```

# 5 #
```java
// i does not have a type declared
for( i = 0; i < 10 ; i++ ){
	// sum is not initialised before being used. Also if it was initialised here it would always be reset.
	int sum;
	
	sum = sum + i;
}
```

# 6 #
`x = ++i` will increment `i` and then assign its value to `x`.
`x = i++` will assign `i` to `x` and then `i` will be incremented.

# 7 #
```java
int x = 0;
int y = 2;

while( x < 10 ){
	if( x != 0 && (x/y % y) == 0 ){
		System.out.println( "I think this will print out that x is currently even???" );
	}
	else{
		System.out.println( "I think x is currently odd or zero???" );
	}
	x++;
}
```

# 8 #
`int`

# 9 #
When trying to convert one type to another, when moving to a lesser precision value or if the destination value is shorter.

# 10 #
see [Primer.java](src/main/java/test/Primer.java)

# 11 #
No, this will only improve readability

# 12 #
yes