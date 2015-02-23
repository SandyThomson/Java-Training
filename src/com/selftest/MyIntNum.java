package com.selftest;

public class MyIntNum {
	private int v;

	public MyIntNum(int x) {
		v = x;
	};

	public int getNum() {
		return v;
	}

	public boolean isFactor(int n) {
		return (v % n) == 0;
	}

	public boolean hasCommonFactor(int n) {
		// Inefficient ahoy!
		for (int i = (n > v) ? v : n; i > 1; i--) {
			if ( (n % i) == 0 && (v % i) == 0) {
				return true;
			}
		}
		return false;
	}
}