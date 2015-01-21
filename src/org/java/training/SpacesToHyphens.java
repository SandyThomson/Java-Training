package org.java.training;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Exercise #7: Concise edition.
 */
public class SpacesToHyphens {
	public static void main(String[] args) throws IOException {
		copy("src/org/java/training/SpacesToHyphens.java", "resources/exercises/ex7.txt");
	}
	
	public static void copy(String a, String b) throws IOException {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(a));
			out = new BufferedOutputStream(new FileOutputStream(b));
			for ( int i = in.read(); i != -1; out.write(i == ' ' ? '-' : i), i = in.read() );
		} catch(IOException e) {
			System.err.printf("Failed to copy [%s] into [%s]", a, b);
		} finally {
			if ( in != null ) in.close();
			if ( out != null ) out.close();
		}
	}
}
