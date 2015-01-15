package mcm_chapter_9.stack;


public class StackFullException extends Exception {

	/**
   * 
   */
	private static final long serialVersionUID = 8673726172383106533L;

	public StackFullException() {
		super( "\nStack is Full" );
	}

}
