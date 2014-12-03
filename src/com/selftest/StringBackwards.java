package com.selftest;

public class StringBackwards {

	public static String reverse(String s) {

		if (s.length() > 1) {
			String stringMinusLastChar = s.substring(0, s.length() - 1);
			String lastChar = s.substring(s.length() - 1, s.length());

			return lastChar + reverse(stringMinusLastChar);
		} else {
			return s;
		}

	}

}
