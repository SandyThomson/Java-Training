package mcm_chapter_12;


public class ToolsDemo {

	public static void main( String[] args ) {
		for ( Tools tool : Tools.values() ) {
			System.out.println( "Tool: " + tool + " Ordinal: " + tool.ordinal() );
		}
	}

}
