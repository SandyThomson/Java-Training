//An enumeration of Transport varieties. 
enum Tools {  
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
} 

public class EnumOrdinals {
 public static void main(String args[])  
 { 
   // Obtain all ordinal values using ordinal(). 
		System.out.println( "Here are all Tools constants" +
                      " and their ordinal values: "); 
		for ( Tools t : Tools.values() )
     System.out.println(t + " " + t.ordinal()); 

 } 
}

