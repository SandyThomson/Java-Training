package org.java.training;

import java.util.function.Predicate;

public class CommonFactor {
	static class MyIntNum {
		private final int n;
		MyIntNum(int n) { this.n = n; }
		int getNum() { return n; }
		
		boolean isFactor(int x) {
			return n % x == 0;
		}
		
		boolean hasCommonFactor(int a) {
			for(int b = n ; a != b ;) {
				if ( a > b ) a -= b;
				else b -= a;
			}
			return a != 1;
		}
	}
	
	public static void main(String[] args) {
		MyIntNum a = new MyIntNum(12), b = new MyIntNum(16);
		
		printFactorOf(a::isFactor, a.getNum(), 3);
		printFactorOf(b::isFactor, b.getNum(), 3);
		
		hasCommonFactorOf(a::hasCommonFactor, a.getNum(), b.getNum());
		hasCommonFactorOf(b::hasCommonFactor, b.getNum(), 7);
	}
	
	public static void printFactorOf(Predicate<Integer> factor, int a, int b) {
		String is = factor.test(b) ? "is" : "is not"; 
		System.out.printf("%d %s a factor of %d%n", b, is, a);
	}
	
	public static void hasCommonFactorOf(Predicate<Integer> commonFactor, int a, int b) {
		String is = commonFactor.test(b) ? "has" : "does not have"; 
		System.out.printf("%d %s a common factor with %d%n", b, is, a);
	}

}
