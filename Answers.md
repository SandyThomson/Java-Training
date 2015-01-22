### Chapter 10 Self Test Answers

1) Why does Java define both byte and character streams.
	
	So that the streams can be optimised for the type of data being output. 

2)
	
	Byte streams were all that was available at the time System.in and System.out were originally defined.

3)

	FileInputStream in = new FileInputStream("inFile.bin");

4)

	FileReader in = new FileReader("inFile.txt");

5)	

	RandomAcessFile in = new RandomAcessFile("inFile.bin", "rw");

6) 

	double d = Double.parse("123.23");

7)

	See [CopyText.java](CopyText.java)
	
8)	

	See [CopyTextImproved.java](CopyTextImproved.java)

9) 

	InputStream

10) 

	-1.

11)

	DataInputStream

12)

	character-based I/O

13)

	automatic resource management

14) 

	True.