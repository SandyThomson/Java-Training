package com.selftest;

import org.junit.Assert;
import org.junit.Test;

public class EncodeTest {

	@Test
	public void testEncodeDecodeLongerString() throws Exception {
		
		Encode encode = new Encode();
		
		encode.setKey("boobs");
		
		String initialString = "funtime";
		
		String encoded = encode.encode(initialString);
		String decoded = encode.decode(encoded);

		Assert.assertEquals("Encoded incorrect", "\n", encoded);
		Assert.assertEquals("Encoded incorrect", initialString, decoded); // Expect a return to the original string


	}
	
	@Test
	public void testEncodeDecodeShorterString() throws Exception {
		
		Encode encode = new Encode();
		
		encode.setKey("boobs"); 
		
		String initialString = "fun";
		
		String encoded = encode.encode(initialString);
		String decoded = encode.decode(encoded);

		Assert.assertEquals("Encoded incorrect", "", encoded);
		Assert.assertEquals("Encoded incorrect", initialString, decoded); // Expect a return to the original string

	}
	
	
	@Test(expected = Exception.class)
	public void testEncodeNoKey() throws Exception {
		
		Encode encode = new Encode();
				
		String initialString = "fun";
		
		encode.encode(initialString);
	}
	
}
