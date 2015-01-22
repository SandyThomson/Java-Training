package com.selftest;

import org.junit.Test;

public class FileCopierTryWithResourcesTest {

	@Test
	public void testOpenFile() throws Exception {
		FileCopierTryWithResources c = new FileCopierTryWithResources();
		c.copyFile("src/com/selftest/OpenFileBytes.java", "src/com/selftest/OpenFileBytes.java.trywithresources");

		// CBA asserting file / contents of file
		// See file in src directory
	}

}
