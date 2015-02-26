/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class QuestionSeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumericFunc lambda = num -> {
			if(num <= 0){
				return 0;
			}
			int total = 1;
			for(int i = 1; i <= num; i++){
				total *= i;
			}
			return total;
		};
		
		int fact = lambda.func(7);
		System.out.println("Factorial of 4 is: " + fact);
	}

}
