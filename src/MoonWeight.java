/*
* Calculate my weight on the moon
*/
class MoonWeight {
	public static void main(String args[]) {
		double my_weight = 70; // kg
		double moon_factor = 0.17;
		System.out.println("Weght on the moon = " 
						+ ( my_weight * moon_factor)
						+ "kg" );
	}
}