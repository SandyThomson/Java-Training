public class prime {
	public static void main(String args[]) {
		for (int x = 2; x <= 100; x++) {
			int isPrime = 1;
			for (int y = 2; y <= Math.ceil(Math.sqrt(x)); y++) {
				if (y == x) {
					break;
				}
				if (0 == (x % y)) {
					isPrime = 0;
					break;
				}
			}
			if (isPrime == 1) {
				System.out.println("Prime : " + x);
			}
		}
	}
}
