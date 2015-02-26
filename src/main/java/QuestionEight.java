/**
 * 
 */
package main.java;

/**
 * @author Mike
 *
 */
public class QuestionEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyFunk<Integer> lambda = num ->{
			if (num <= 0){
				return 0;
			}
			
			int result = 1;
			for( int i = 1; i <= num; i++){
				result *= i;
			}
			return result;
		};
		
		int fact = lambda.func(8);
		System.out.println("Factorial of 4 is: " + fact);
	}

}
