

public class ToolBox {
	
	public static void main ( String[] args ){
		
		
		for (Tools t : Tools.values() ) {
			
			System.out.println( "Enum: " + t);
			System.out.println( "Ordinal: " + t.ordinal());
		}
	}

}
