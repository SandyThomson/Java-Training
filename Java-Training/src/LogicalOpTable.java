

public class LogicalOpTable {
	
	public static void main ( String[] args ) {
		
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = false; q = false;
		System.out.print( boolToInt(p) + "\t" + boolToInt(q) + "\t" );
		System.out.print( boolToInt( (p&q) ) + "\t" + boolToInt( (p|q) ) + "\t");
		System.out.println( boolToInt( (p^q) ) + "\t" + boolToInt( (!p) ) );
		
		p = true; q = false;
		System.out.print( boolToInt(p) + "\t" + boolToInt(q) + "\t" );
		System.out.print( boolToInt( (p&q) ) + "\t" + boolToInt( (p|q) ) + "\t");
		System.out.println( boolToInt( (p^q) ) + "\t" + boolToInt( (!p) ) );
		
		p = false; q = true;
		System.out.print( boolToInt(p) + "\t" + boolToInt(q) + "\t" );
		System.out.print( boolToInt( (p&q) ) + "\t" + boolToInt( (p|q) ) + "\t");
		System.out.println( boolToInt( (p^q) ) + "\t" + boolToInt( (!p) ) );

		p = true; q = true;
		System.out.print( boolToInt(p) + "\t" + boolToInt(q) + "\t" );
		System.out.print( boolToInt( (p&q) ) + "\t" + boolToInt( (p|q) ) + "\t");
		System.out.println( boolToInt( (p^q) ) + "\t" + boolToInt( (!p) ) );
	}
	
	public static int boolToInt( boolean booler ) {
		int converted;
		
		if (booler) {
			converted = 1;
		}
		else {
			converted = 0;
		}
		
		return converted;
	}




}
