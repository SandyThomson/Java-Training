public class prime {
	public static void main(String args[]) {
		mainloop: for (int primeCandidate = 2; primeCandidate <= 100; primeCandidate++) {
			int campareMax = (int)Math.ceil(Math.sqrt(primeCandidate));
			for (int divideCandidate = 2; divideCandidate <= campareMax; divideCandidate++) {
				if (divideCandidate != primeCandidate && 0 == (primeCandidate % divideCandidate)) {
					// fail, will divide - try next candidate
					continue mainloop;
				}
			}
			// All comparisons don't divide
			System.out.println("Prime : " + primeCandidate);
		}
	}
}
