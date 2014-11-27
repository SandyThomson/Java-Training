package selftest;

//Use XOR to encode and decode a message.
public class Encode {
	public static void main(String args[]) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "foobar";
		int j;

		System.out.print("Original message: ");
		System.out.println(msg);

		// encode the message
		j = 0;
		for (int i = 0; i < msg.length(); i++) {
			encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j++));
			if (j == key.length()) {
				j = 0;
			}
		}
		System.out.print("Encoded message: ");
		System.out.println(encmsg);

		// decode the message
		j = 0;
		for (int i = 0; i < msg.length(); i++) {
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j++));
			if (j == key.length()) {
				j = 0;
			}
		}
		System.out.print("Decoded message: ");
		System.out.println(decmsg);
	}
}