package org.java.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Exercise #8: Concise edition.
 */
public class SpacesToHyphensMarkTwo {
	public static void main(String[] args) throws IOException {
		copy("src/org/java/training/SpacesToHyphensMarkTwo.java", "resources/exercises/ex8.txt");
	}
	
	public static void copy(String a, String b) throws IOException {
		try ( BufferedReader reader = new BufferedReader(new FileReader(a));
			  BufferedWriter writer = new BufferedWriter(new FileWriter(b)) ) {

			for ( String line = reader.readLine();
			      line != null;
			      writer.write(line.replace(' ', '-') + "\n"),
			      line = reader.readLine() );
		} catch(IOException e) {
			System.err.printf("Failed to copy [%s] into [%s]", a, b);
		}
	}
}
