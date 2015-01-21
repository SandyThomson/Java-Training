#### Chapter 10 Self Test Answers

1) Java defines both _byte_ and _character_ streams because _byte_ streams are useful for when working with files allowing the user to read or write binary data.  However, _character_ streams are designed for handling the input and output of characters in that they use **Unicode** and, therefore, can be internationalized.

2) They were part of the original specification for Java which did not include _character_ streams.

3) 
```java
FileInputStream input = new FileInputStream( "file.txt" );
```

4)
```java
FileReader reader = new FileReader( "file.txt" );
```

5)
```java
RandomAccessFile access = new RandomAccessFile( "file.txt", "rw" );
```

6)
```java
Double d = Double.parseDouble( "123.23" );
```

7) See [QuestionSeven.java](src/com/selftest/QuestionSeven.java)

8) See [QuestionEight.java](src/com/selftest/QuestionEight.java)

9) _Byte_ input stream.

10) -1

11) **DataInputStream**

12) _character_ _stream_

13) _automatically_ _closing_ _resources_

14) True