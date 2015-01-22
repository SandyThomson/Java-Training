# MCM Chapter10 Answers

**1. Why does Java define both byte and character streams?**

Java defines both in order to support reading of character based streams, and binary streams. Character streams are unicode based and can be internationalised, and allow the developer convenience in reading in text based files. Byte streams can still be used for reading in characters, in fact character streams are based on byte streams, but offer a number of convenience features, and can in some cases be more efficient to use for text than byte streams.

**2. Even though console input and output is text-based, why does Java still use byte streams for
this purpose?**

Because the first version of Java only had Byte streams and the System.in() and System.out() is byte stream based, although character streams can also be used.

**3. Show how to open a file for reading bytes.**

See [OpenByteFileDemo.java](io/OpenByteFileDemo.java)

**4. Show how to open a file for reading characters.**

See [OpenCharacterFileDemo.java](io/OpenCharacterFileDemo.java)

**5. Show how to open a file for random-access I/O.**

Use the RandomAccessFile Object to open the file and the seek() operator to go to a location


```java
 	RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")
 
 	raf.seek(0);
	d = raf.readDouble(); //etc...
```

**6. How can you convert a numeric string such as "123.23" into its binary equivalent?**

There are a number of ways of converting a string number into binary (e.g., see [ConvertStringToBinary.java](io/ConvertStringToBinary.java), however easier ways are to use the Integer Parsing methods e.g.,

```java
	int fooInt = Integer.parseInt("foo");
```

**7. Write a program that copies a text file. In the process, have it convert all spaces into hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close( ).**

See [OpenByteFileConvertSpacesToHyphens.java](io/OpenByteFileConvertSpacesToHyphens.java)

**8. Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the try-with-resources statement to automatically close the file.**

See [CopyOfOpenCharacterConvertSpacesToHyphens.java](io/CopyOfOpenCharacterConvertSpacesToHyphens.java)

**9. What type of stream is System.in?**

An inputstream

**10. What does the read( ) method of InputStream return when the end of the stream is
reached?**

a value of -1

**11. What type of stream is used to read binary data?**

DataInputStream (see java solutions above)

**12. Reader and Writer are at the top of the ____________ class hierarchies**
Character Stream I/O

**13. The try-with-resources statement is used for ___________ ____________ ____________.**

Automatic Resource Management

**14. If you are using the traditional method of closing a file, then closing a file within a finally block is generally a good approach. True or False?**

True - means it will always close, even if an exception has been thrown.