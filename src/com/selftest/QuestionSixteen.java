package com.selftest;

public class QuestionSixteen {

	public interface IntPredicate {
		boolean test(MyIntNum min, int n);
	}

	public static void main(String[] args) {

		IntPredicate ip = MyIntNum::hasCommonFactor;

		MyIntNum min = new MyIntNum(9);
		MyIntNum min2 = new MyIntNum(12);

		System.out.println(ip.test(min, 3)); // t
		System.out.println(ip.test(min, 4)); // f
		System.out.println(ip.test(min, 81)); // t
		System.out.println(ip.test(min2, 24)); // t
		System.out.println(ip.test(min2, 25)); // f

	}

}
