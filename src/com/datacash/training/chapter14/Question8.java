package com.datacash.training.chapter14;

interface MyFunc<T> {
	T func(T n);
}

public class Question8 {

	public static void main(String[] args) {

		MyFunc<Integer> factorial = (n) -> {

			int fct = 1; // 0! is 1
			for (int i = 1; i <= n; i++) {
				fct *= i;
			}

			return fct;
		};

		System.out.println("Factorial of 5 is " + factorial.func(5));
		System.out.println("Factorial of 8 is " + factorial.func(8));
		System.out.println("Factorial of 11 is " + factorial.func(11));
	}

}
