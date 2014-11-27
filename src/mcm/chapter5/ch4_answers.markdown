## Java Training Chapter 4 Answers

**Q1: Show two ways to declare a one dimensional array of 12 doubles:

	//First Way
	double[] dblArray = new double[12];
	double dblArray[] = new double[12];

** Q2: Show how to initialise a one dimensional array of integer values through 1 to 5

	int[] intArray = {1,2,3,4,5};
	
** Q3: See Average Finder

** Q4 See StringSorter... for a sort of solution

** Q5 What is the difference between the String methods of indexOf() and lastIndexOf()

indexOf(str) returns the the index of the first match of str, or -1 if no matches. lastIndexOf(str) returnes the index of the last matchin of str, or -1 if no match.

** Q6 As follows:
	"I like Java".length();
	"I like Java".charAt(1);
	
** Q7: See Encode.java

** Q8: Bitwise operators cannot be applied to double types

** Q9: y = x < 0 ? 10 : 20;

** Q10: The & is a logical operator as it is being performed on two booleans and is the subject of an if statement.

** Q11: Yes, its an error to overrun the end of an array and to index with a negative value.

** Q12: The unsigned right-shift operator shifts a value a specified number of bits to the right while preserving the sign bit.

** Q13: See MinMax.java

**Q14: For each loops can't really be used in the bubble sort application in the same way as the for loops as this implementation relies on the index of each iteration, and relies on writing back to the array. For each values do not reference back to the original array, so we can't update the array by reassigining a value to them. I guess a for each loop could be used for bubble sort, along with counter variables or something, but there wouldn't be much point doing it this way.

** Q15: A string can control a switch statement as of Java 7. Before this Strings couldn't be used for switch statements.

	

