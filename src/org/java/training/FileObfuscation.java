package org.java.training;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileObfuscation {
	private static final String LF = System.getProperty("line.separator");
	
	public static void main(String[] args){
		CSVObfuscator obfuscator = new CSVObfuscator("|");
		
		obfuscator
			.headerTransform("CV2", s -> null)
			.transform("CV2", s -> null)
			.transform("Expiry", s -> s.replaceAll(".", "#"))
			.transform("Card Number", s -> s.substring(0, 6) + s.substring(6, s.length()).replaceAll(".", "#"));
		
		try(Stream<String> input = Files.lines(Paths.get("resources/customer-data"));
			BufferedWriter writeBuffer = new BufferedWriter(new FileWriter("resources/clean-customer-data")) ) {

			input.parallel().map(obfuscator::obfuscateLine).forEachOrdered(line -> {
				try {
					writeBuffer.write(line);
					writeBuffer.write(LF);
				} catch (IOException e) {
					System.err.println("Failed to write obfuscated output: " + e.getMessage());
				}
			});
		} catch (IOException e) {
			System.err.println("Could not process input file: " + e.getMessage());
		}
	}
}
