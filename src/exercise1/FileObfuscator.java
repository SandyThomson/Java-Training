package exercise1;

import java.io.File;

/**
 * File Obfuscation interface
 * 
 * @author Malcolm.Murray
 *
 */
public interface FileObfuscator {

	/**
	 * Obfuscate a file
	 * 
	 * @param the File object corresponding to the file to be obfuscated
	 * @return a string containing the obfuscated text
	 */
	public String obfuscate( File file );

	/**
	 * Obfuscate a file by filename
	 * 
	 * @param filename of the file to be obfuscated
	 * @return a string containing the obfuscated text
	 */
	public String obfuscate( String filename );

}
