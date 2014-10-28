import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mike
 *
 */
public class GravityCalc {

	// On the moon we weight 17% of what we do on Earth
	public static final BigDecimal MOON_RATIO = new BigDecimal("0.17");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Prompt for a weight
		System.out.print("Please enter your weight (kg): ");
		Scanner scanner = new Scanner(System.in);

		// Read the input from the terminal
		String input = scanner.nextLine();
		scanner.close();

		// initialise the users weight
		BigDecimal weight = BigDecimal.ZERO;
		try {
			weight = new BigDecimal(input);
		} catch (NumberFormatException nfe) {
			throw new MikeException();
		}
		weight = weight.multiply(MOON_RATIO);
		System.out.println("You weigh " + weight + " on the moon!");
		System.exit(0);
	}

	public static class MikeException extends RuntimeException {
		/**
		 * Standard error for when the user fails to type a decimal value
		 */
		private static final long serialVersionUID = 314159L;
		String message = "You entered an invalid weight! Enter a decimal please!";
	}

}
