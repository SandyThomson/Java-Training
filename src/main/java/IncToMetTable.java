
/**
 * 
 */

/**
 * @author Mike
 *
 */
public class IncToMetTable {
	public static final double INCHES_RATIO = 39.37D;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inches, meters;

		for (inches = 1D; inches <= 100D; inches++) {

			meters = inches / INCHES_RATIO;
			System.out.println(inches + " inches is " + meters + " meters.");

			if ((inches % 12) == 0) {
				System.out.println();
			}
		}
	}
}
