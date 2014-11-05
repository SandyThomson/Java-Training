/**
 * 
 */
package tryit;

/**
 * @author Mike
 *
 */
public class LightningDetector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double time = 7.2D;

		// underscores ftw!
		double dist = (time / 2) * 1_100;

		System.out.println("The lighning is " + dist + " feet away");
	}

}
