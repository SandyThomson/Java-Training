package com.selftest;

import org.junit.Test;

public class ToolsTest {

	@Test
	public void TestTools() {
		for (Tools t : Tools.values()) {
			System.out.println("Enum value:" + t.toString());
			System.out.println("Ordinal value: " + t.ordinal());
		}
	}
}
