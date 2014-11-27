package com.selftest;

public class Encode {

	private String key;

	public String encode(String plaintext) throws Exception {
		return xor(plaintext);
	}

	public String decode(String encodedMessage) throws Exception {
		return xor(encodedMessage);
	}

	private String xor(String message) throws Exception {
		if (key == null)
			throw new Exception("Key needs to be defined, mkay!"); // Lazy
																	// exception

		StringBuffer xorMessage = new StringBuffer();

		for (int i = 0; i < message.length(); i++) {

			xorMessage.append((char) (message.charAt(i) ^ (key.charAt(i % key.length()))));
		}

		return xorMessage.toString();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
