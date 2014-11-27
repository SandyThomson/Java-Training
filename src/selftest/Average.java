package selftest;

public class Average {
	public static void main(String[] args) {
		double[] nums = { 1.23, 2.34, 3.45, 4, 0.23, 346.2346, 52.3, 5.4, 625,
				21356.213 };
		System.out.println("Sample data:");
		for (double num : nums) {
			System.out.println(num);
		}
		double average = findAverage(nums);
		System.out.println("Average is: " + average);
	}

	static double findAverage(double[] nums) {
		double total = 0;
		for (double num : nums) {
			total += num;
		}
		return total / nums.length;
	}
}
