public class StackDemo{
	public static void main(String args[]){
		char data[] = {'a','b','c','d','e','f','g','h','i','j'};
		Stack stack = new Stack(10);
		for(char ch : data) stack.push(ch);
		for (int i = 0; i < 10; i++) System.out.println("Character " + i + " = "+stack.pop());
	}	
}	

class Stack {
  private char data[];
  private int position=0;
  
  Stack (int size) { data = new char[size]; }
  
  void push (char ch){ data[position++ % data.length] = ch;   }
  char pop  ()       { return data[--position % data.length]; }
}