package com.selftest;

public class QuestionNine {

	public interface StringFunc {
		String func(String str);
	}

	public static String changeStr(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr = "Lambda Expressions Expand Java";
		String outStr;

		System.out.println("Here is the input string: " + inStr);

		StringFunc removeSpaces = (str) -> {
			return str.replaceAll("\\s", "");
		};

		outStr = changeStr(removeSpaces, inStr);

		System.out.println("Here is the output string: " + outStr); // Here is the output string: LambdaExpressionsExpandJava
	}
}
