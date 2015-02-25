package com.datacash.training.chapter14;

interface StringFunc {
  String func( String str );
}

public class Question9 { 
	   
	  static String changeStr(StringFunc sf, String s) { 
	    return sf.func(s); 
	  } 
	 
	  public static void main(String args[]) 
	  { 
	    String inStr = "Lambda Expressions Expand Java"; 
	    String outStr; 
	 
	    System.out.println("Input string: " + inStr); 
	 
	    // Remove spaces
	    StringFunc noSpaces = (str) -> str.replace(" ", ""); 
	 
	    // Test
	    outStr = changeStr(noSpaces, inStr); 
	    System.out.println("Spaces removed:" + outStr); 
	 
	 
	  } 
	}
