/**
 * 
 */
package chapter1;

import java.text.DecimalFormat;

/**
 * @author fitzretsil
 *
 */
public class Convertor {
	
	double ratio = 1.0;
	
	/**
	 * @param ratio
	 */
	public Convertor(double ratio) {
		super();
		this.ratio = ratio;
	}
	
	public String convert( double input ) {
		double output = (input * ratio);

		DecimalFormat df = new DecimalFormat("0.00");
		
		return df.format(output);
		
	}
}
