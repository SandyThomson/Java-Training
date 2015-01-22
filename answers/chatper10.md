### Chapter 10 Self Test

1) _Why does Java define both byte and character streams?_

Originally Java only supported byte streams, and they continue to be useful for handling binary data, while character streams were added later to help with I/O of unicode.

2) _Even though console input and output is text-based, why does Java still use byte streams for this purpose?_

As the System I/O streams were set up before Java supported character streams.

3) _Show how to open a file for reading bytes._

`FileInputStream input = new FileInputStream( "blarg" );`

4) _Show how to open a file for reading characters._

`FileReader input = new FileReader( "blarg" );`

5) _Show how to open a file for random-access I/O._

`RandomAccessFile file = new RandomAccessFile( "blarg, "rw" );`

6) _How can you convert a numeric string such as "123.23" into its binary equivalent?_

Through use of the parsing methods in their type wrappers e.g. Integer.parseInt or Double.parseDouble

7) _Write a program that copies a text file. In the process, have it convert all spaces into hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close._

[SpacesToHyphens.java](src/SpacesToHyphens.java).

8) _Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the **try-with-resources** statement to automatically close the file._

[SpacesToHyphensMarkTwo.java](src/SpacesToHyphens2.java).

9) _What type of stream is `System.in`?_

InputStream

10) _What does the `read()` method of `InputStream` return when the end of stream is reached?_

-1

11) _What type of stream is used to read binary data?_

DataInputStream

12) _`Reader` and `Writer` are at the top of the _______ _class hierarchies._

character I/O

13) _The **try-with-resources** statement is used for _____ _____ _____._

automatic resource management

14) _If you are using the traditional method of closing a file, then closing a file within a finally block is generally a good approach. True or False?_

True