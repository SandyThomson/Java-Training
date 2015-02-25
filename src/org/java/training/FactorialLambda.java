package org.java.training;

public class FactorialLambda {
	@FunctionalInterface
	interface NumericFunc {
		int func(int n);
	}

	public static void main(String[] args) {
		NumericFunc factorial = n -> {
			for(int i = n; i > 1; n *= --i);
			return n;
		};
		
		System.out.println(factorial.func(5));
	}

}
