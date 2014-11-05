// Try This 2-2: a truth table for the logical operators.
public class LogicalOpTable {

	public static void main(String args[]) {
		boolean p, q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true;
		q = true;
		truth(p, q);

		p = true;
		q = false;
		truth(p, q);

		p = false;
		q = true;
		truth(p, q);

		p = false;
		q = false;
		truth(p, q);
	}

	private static void truth(boolean p, boolean q) {
		System.out.print(truthval(p) + "\t" + truthval(q) + "\t");
		System.out.print(truthval(p & q) + "\t" + truthval(p | q) + "\t");
		System.out.println(truthval(p ^ q) + "\t" + truthval(!p));
	}

	private static int truthval(boolean r) {
		if (r) {
			return 1;
		}
		return 0;
	}

}
