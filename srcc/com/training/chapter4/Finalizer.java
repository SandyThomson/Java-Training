package com.training.chapter4;

public class Finalizer {

	private int value;

	public Finalizer(int i) {
		this.value = i;
	}

	@Override
	protected void finalize() {
		System.out.println("Finalizing " + value);
	}

	public static void generate(int i) {
		Finalizer fin = new Finalizer(i);
	}
}
