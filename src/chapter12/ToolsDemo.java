package chapter12;


enum Tools {
	SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

public class ToolsDemo {

	public static void main( String[] args ) {
		for ( Tools t : Tools.values() ) {
			System.out.println( t + " has an ordinal of " + t.ordinal() );
		}
	}
}
