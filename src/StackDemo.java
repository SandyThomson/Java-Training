public class StackDemo{
	
	public static void main(String args[]){
		char data[] = {'a','b','c','d','e','f','g','h','i','j','k'};
		Stack stack = new Stack(10);
		for(char ch : data) stack.push(ch);
		try{
		  for (int i = 0; i < 11; i++) System.out.println("Character " + i + " = "+stack.pop());
		}
		catch (StackUnderflowException e){
		  System.out.println("Stack Underflow value no character could be returned.");
		}
	}	
}	
class StackOverflowException extends Throwable {}
class StackUnderflowException extends Throwable {}

class Stack {
	
  private char data[];
  private int position=0;
  

  
  Stack (int size) { data = new char[size]; }
  
  void push (char ch)
  { 
	try {
	  if (position >= data.length) throw new StackOverflowException();
	  data[position++] = ch;
	}
	catch (StackOverflowException e) {
	  System.out.println("Stack Overflow value "+ch+" was not stored.");
	}
  }
  char pop () throws StackUnderflowException {
	  if (position < 1 ) throw new StackUnderflowException();
      return data[--position];
  }
}