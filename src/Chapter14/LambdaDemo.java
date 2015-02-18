package Chapter14;

// Mostly borrowed from the book

class LambdaDemo { 
   
  static String changeStr(StringFunc sf, String s) { 
    return sf.func(s); 
  } 
 
  public static void main(String args[]) 
  { 
    String inStr = "Lambda Expressions Expand Java"; 
    String outStr; 
 
    System.out.println("Here is input string: " + inStr); 
 
    // No more spaces
    StringFunc unspace = (str) ->  { 
      String result = ""; 
      
      for ( char c : str.toCharArray() )
        if (c != ' ') {
          result += c;
        }
 
      return result; 
    }; 
 
    // use it
    outStr = changeStr(unspace, inStr); 
    System.out.println("Nospaceforyou:" + outStr); 
 
 
  } 
}


