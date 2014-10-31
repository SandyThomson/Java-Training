/**
 * 
 */
package chapter1;

/**
 * @author fitzretsil
 *
 */
public class WeightOnTheMoon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			double weightOnEarth = Double.parseDouble(args[0]);
			
			Convertor EarthWeightToMoonWeightConvertor = new Convertor(0.83);
						
			String weightOnMoon = EarthWeightToMoonWeightConvertor.convert(weightOnEarth);
						
			System.out.println("Your weight would be " + weightOnMoon + "kg on the moon.");
		} catch (NumberFormatException e) {
			System.out.println("Please provide your weight in kgs numerically.");
		}
		
	}

}
