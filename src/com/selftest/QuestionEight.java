package com.selftest;

public class QuestionEight {

	interface MyFunc<T extends Number> {
		T func(T t);
	}

	public static void main(String[] args) {
		MyFunc<Short> factorialShort = (n) -> {
			short temp = n;

			for (int i = n.intValue() - 1; i > 0; i--) {
				temp *= i;
			}

			return temp;
		};

		MyFunc<Long> factorialLong = (n) -> {
			long temp = n;

			for (int i = n.intValue() - 1; i > 0; i--) {
				temp *= i;
			}

			return temp;
		};

		short s = 3;
		System.out.println(factorialShort.func(s)); // 6
		System.out.println(factorialLong.func(35L)); // 6399018521010896896

	}

}
