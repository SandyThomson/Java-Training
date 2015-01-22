package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class OpenFileRandomAccessTest {

	@Test
	public void testOpenFile() throws Exception {
		OpenFileRandomAccess of = new OpenFileRandomAccess();
		String actual = of.openFile("src/com/selftest/OpenFileBytes.java");

		String expected = " java.io.ByteArrayOutputStream;";
		Assert.assertEquals(expected, actual);
	}

}
