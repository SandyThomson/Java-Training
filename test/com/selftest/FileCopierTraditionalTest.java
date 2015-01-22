package com.selftest;

import org.junit.Test;

public class FileCopierTraditionalTest {

	@Test
	public void testOpenFile() throws Exception {
		FileCopierTraditional c = new FileCopierTraditional();
		c.copyFile("src/com/selftest/OpenFileBytes.java", "src/com/selftest/OpenFileBytes.java.traditional");

		// CBA asserting file / contents of file
		// See file in src directory
	}

}
