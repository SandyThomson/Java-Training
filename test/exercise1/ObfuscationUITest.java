package exercise1;

import org.junit.Test;


public class ObfuscationUITest {

	@Test
	public void testFileObfuscation() {
		FileObfuscator obfuscator = new CustomerFileObfuscator();
		
		String obfuscatedFile = obfuscator.obfuscate( this.getClass().getResource( "customerdata.txt" ).getFile() );
		System.out.println( "Obfuscated file: " + obfuscatedFile );
		
	}

}
