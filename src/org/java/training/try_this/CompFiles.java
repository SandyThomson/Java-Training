package org.java.training.try_this;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Try This 10-1
 */
public class CompFiles {

	public static void main(String[] args) {
		if ( args.length != 2 ) {
			System.out.println("Usage: CompFiles <File A> <File B>");
			return;
		}
		int i = 0, j = 0;
		try( InputStream a = new FileInputStream(args[0]);
			 InputStream b = new FileInputStream(args[1]) ) {
			do {
				i = a.read();
				j = b.read(); 
				if (i != j) break;
			} while (i != -1 && j != -1);
		} catch (IOException e) {
			System.err.println("I/O error: " + e.getLocalizedMessage());
		}
		
		if ( i != j )
			System.out.println("Files differ");
		else 
			System.out.println("Files contain the same contents");
	}
}
