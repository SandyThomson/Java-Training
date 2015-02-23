package com.selftest;

import java.util.function.UnaryOperator;

public class QuestionSeven {

	public static void main(String[] args) {

		UnaryOperator<Integer> factorial = (n) -> {
			int temp = n;

			for (int i = n - 1; i > 0; i--) {
				temp *= i;
			}

			return temp;
		};

		System.out.println(factorial.apply(3)); // 6
		System.out.println(factorial.apply(5)); // 120
		System.out.println(factorial.apply(10)); // 3628800

	}

}
