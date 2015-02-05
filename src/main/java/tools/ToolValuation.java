/**
 * 
 */
package main.java.tools;

/**
 * @author Mike
 *
 */
public class ToolValuation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (Tools tool : Tools.values()) {
			System.out.println("Tool: [" + tool + "] has a value of "
					+ tool.ordinal());
		}

	}

}
