package com.selftest;

import java.util.function.Predicate;

public class QuestionFive {

	public static void main(String[] args) {

		Predicate<Integer> expressionLambda = (n) -> ( n >= 10 && n <= 20 );
		
		System.out.println(expressionLambda.test(12));
		System.out.println(expressionLambda.test(5));
		System.out.println(expressionLambda.test(21));

	}
}
