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
	
	public void setRatio( double ratio ) {
		this.ratio = ratio;
	}
	
	public double convert( double input ) {
		return (input * ratio);
	
	}
	
	public String convertAndFormat( double input ) {
		double output = this.convert( input );

		DecimalFormat df = new DecimalFormat("0.00");
		
		return df.format(output);
		
	}
}
