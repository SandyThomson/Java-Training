1) Byte streams were developed for early versions of Java to allow IO. Character streams
were added later to make text IO simpler without altering byte stream support.

2) Console IO was originally performed with byte streams, this has been retained in newer
versions of Java for legacy support.

3)
```java
FileInputStream file = new FileInputStream( "SomeFile.txt" );
```

4)
```java
FileReader file = new FileReader( "SomeFile.txt" );
```

5)
```java
RandomAccessFile file = new RandomAccessFile( "SomeFile.txt", "r" );
```

6)
```java
double parsed = Double.parseInt( "123.23" );
```

7) See CopyFileBytes.java

8) See CopyFileChars.java

9) Byte stream.

10) -1

11) ``DataInputStream``

12) Reader & Writer are at the top of the character stream class hierarchies.

13) Try with resources is used for automatic resource management.

14) True.
