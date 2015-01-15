package mcm_chapter_9.stack;


public class StackEmptyException extends Exception {

	/**
   * 
   */
	private static final long serialVersionUID = 8673726172383106533L;

	public StackEmptyException() {
		super( "\nStack is Empty" );
	}

}
