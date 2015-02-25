package org.java.training;

public class FactorialLambdaGeneric {
	@FunctionalInterface
	interface MyFunc<T> {
		T func(T n);
	}

	public static void main(String[] args) {
		MyFunc<Integer> factorial = n -> {
			for(int i = n; i > 1; n *= --i);
			return n;
		};
		
		System.out.println(factorial.func(5));
	}

}
