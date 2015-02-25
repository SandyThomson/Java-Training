package org.java.training.try_this;

import java.util.stream.Collectors;

/**
 * Try This 14-1
 */
public class LambdaArgs {

	@FunctionalInterface
	interface StringOp {
		String translate(String s);
	}

	public static void printOp(String s, StringOp op) {
		System.out.println(op.translate(s));
	}

	public static void main(String[] args) {
		String test = "Lambda expressions are my basic requirement for a language";

		printOp(test, s -> new StringBuilder(s).reverse().toString());
		printOp(test, s -> s.replace(' ', '-'));
		printOp(test, s -> s.chars().map(ch -> 
			(ch >= 'a' && ch <= 'z') ? ch - 32 :
			(ch >= 'A' && ch <= 'Z') ? ch + 32 : ch
			).mapToObj(i -> "" + (char)i).collect(Collectors.joining()));
	}

}
