### Chapter 10 Self Test

  1) _Why does Java define both byte and character streams?_

Byte streams are necessary for low-level IO. Character streams are essential to
abstract away the complexity of the unicode representation of characters, and
thus simplify internationalisation.

  2) _Even though console input and output is text-based, why does Java still use
      byte streams for this purpose?_

Legacy reasons. Java initially only shipped with byte streams, and thus to ensure
backwards compatibility, console input and output still uses byte streams.

  3) _Show how to open a file for reading bytes._

```java
try ( BufferedInputStream is = new BufferedInputStream(new FileInputStream("myfile.txt")) ) {
  // do something with it...
} 
```

  4) _Show how to open a file for reading characters._

```java
try ( BufferedReader ir = new BufferedReader(new FileReader("myfile.txt)) ) {

}
```

Or for lazily-evaluated line reading:

```java
try ( Stream<String> in = Files.lines(Paths.get("src/org/java/training/Blargh.java")) ) {
	// Print out the imports
	in.filter(s -> s.trim().startsWith("import")).forEach(System.out::println);
}
```

  5) _Show how to open a file for random-access I/O._

For regular disk-read I/O:
```java
try ( RandomAccessFile io = new RandomAccessFile("resources/try_this/helpfile.txt", "r") ) {
	io.seek(64);
}
```

For fast, memory mapped I/O, the following example program (the cruft at the top is because Java chars
expect UTF-16, but my text file in this example is ASCII):
```java
IntFunction<String> asciiFromUTF16 = i -> (char)((i >> 8) & 0xff) + "" + (char)(i & 0xff);

try ( RandomAccessFile diskFile = new RandomAccessFile("resources/try_this/helpfile.txt", "r") ) {
	FileChannel channel = diskFile.getChannel();
	MappedByteBuffer mmapped = 
		channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

	mmapped.asCharBuffer().chars().mapToObj(asciiFromUTF16).forEach(System.out::print);
}
```

  6) _How can you convert a numeric string such as "123.23" into its binary equivalent?_

```java
double x = Double.parseDouble("123.23");
```

  7) _Write a program that copies a text file. In the process, have it convert all spaces
  	  into hyphens. Use the byte stream file classes. Use the traditional approach to
  	  closing a file by explicitly calling close._

[SpacesToHyphens.java](src/org/java/training/SpacesToHyphens.java).

  8) _Rewrite the program described in question 7 so that it uses the character stream
  	  classes. This time, use the **try-with-resources** statement to automatically
  	  close the file._

[SpacesToHyphensMarkTwo.java](src/org/java/training/SpacesToHyphensMarkTwo.java).

  9) _What type of stream is `System.in`?_

An `InputStream`.

 10) _What does the `read()` method of `InputStream` return when the end of stream is
      reached?_

`-1`.

 11) _What type of stream is used to read binary data?_

For bytes, `InputStream`. For conversions to Java primitives, `DataInputStream`.

 12) _`Reader` and `Writer` are at the top of the _______ class hierarchies._

Character stream.

 13) _The **try-with-resources** statement is used for _____ _____ _____._

The answer it wants is Automatic Resource Management, though the concept used is more
specifically referred to (especially in the C++ realm) as Resource Acquisition is
Initialisation (RAII) - that is, object creation represents resource acquisition, 
object destruction (descoping, in the Java case, because Java defers actual object
destruction to the garbage collector, and thus can't be guaranteed to free resources
there) results in safe release of the owned resource, even when exceptions are thrown.

 14) _If you are using the traditional method of closing a file, then closing a file
      within a finally block is generally a good approach. True or False?_

True - this ensures the file is closed, even when exceptions occur.