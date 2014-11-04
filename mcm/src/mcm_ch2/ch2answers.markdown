
# Java A beginner's guide - chapter 2 Answers

**Q1** Java variables are strongly types to promote compatibility, help prevent errors and increase reliability.

**Q2** Java's charcter type is unicode, and is an unsigned 16-bit data type, allowing for a ranfe from 0 to 65,536. This means that Java's character type is capable of storing the majority (if not all) of the world's character sets. This may be inefficient for commonly used character sets, but is the price of worldwide compatibility.
**Q3** This is false, a boolean type in Java can only be one of the reserved keywords *true* or *false*.

**Q4** The single String used to print this particular multi line string is as follows:

    "One\nTwo\nThree"
    
**Q5** The sum variable only exists within the scope of the *for* statement and therefore, it is not avaiable to the println() statement outide the for loop.

**Q6** The prefix form of the increment operator (*++i*) performs the increment operation before the value of the subject variable is used, whereas the postfix form (*i++*) performs the increment operation after the subject variable has been accessed. E.g.,:
	
	int i = 10;
	int j = ++i;
	System.out.println("i: "+i+" j: "+j); //Prints i: 11 and j: 11;

	int k = 10;
	int l = k++;
	System.out.println("k: "+k+" l: "+l); //Prints k:11  and l: 10;
	
**Q7** A short circuit operator can avoid a divide by zero error as follows:
	
	//Version without a short circuit operator
	int n = 10;
	int d = 0;
	
	if(d != 0 & n/d > 1){
		//Boom - we've divided by 0 as both expressions above have been evaluated
		//The world has now ended
	}

:finnadie:

	//Version with a short circuit operator
	int n = 10;
	int d = 0;
	
	if(d != 0 && n/d > 1){
	
	}
	
	//Only the first expression was evaluated, since it was false we haven't bothered evaluating the 2nd expression
	//So we have now reached here and all is well with the world!

:smile:

**Q8** Byte and short will be promoted to int in an expression as this will be large enough to hold both.

**Q9** Casts are generally required to convert one object type to another. Some automatic casting can take place, but this is generally only widening, e.g., a short to an int and so on.

**Q10** See Code

	







