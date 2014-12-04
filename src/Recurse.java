
public class Recurse {
  public static void main (String args[]){
	  String string = "ABCDEFGHI";
	  System.out.println("Original = " + string );
	  System.out.println("Reversed = " + reverse(string) );
  }
  
  static public String reverse(String input){
	  String last  = input.substring(input.length() - 1);
	         input = input.substring(0, input.length() - 1);
	         
	  if (input.length() != 0 )  last = last + reverse(input);
	  return last;  
  }
}
