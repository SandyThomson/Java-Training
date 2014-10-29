/**
 * 
 */
package chapter1;

import java.text.DecimalFormat;

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
			
			Convertor EarthWeightToMoonWeightConvertor = new Convertor();
			EarthWeightToMoonWeightConvertor.setRatio(0.83);
						
			double weightOnMoon = EarthWeightToMoonWeightConvertor.convert(weightOnEarth);
			
			DecimalFormat df = new DecimalFormat("#.0");
			
			System.out.println("Your weight would be " + df.format(weightOnMoon) + "kg on the moon.");
		} catch (NumberFormatException e) {
			System.out.println("Please provide your weight in kgs numerically.");
		}
		
	}

}
