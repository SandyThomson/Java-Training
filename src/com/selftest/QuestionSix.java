package com.selftest;

public class QuestionSix {

	interface NumTest<T extends Number> {
		boolean func(T t);
	}

	public static void main(String[] args) {

		NumTest<Integer> intLambda = (n) -> (n >= 10 && n <= 20);
		NumTest<Double> doubleLambda = (n) -> (n >= 10 && n <= 20);

		System.out.println(intLambda.func(12));
		System.out.println(doubleLambda.func(5.5));
		System.out.println(doubleLambda.func(10.0000001));
	}

}
