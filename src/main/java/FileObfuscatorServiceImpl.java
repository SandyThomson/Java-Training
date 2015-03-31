package main.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FileObfuscatorServiceImpl implements FileObfuscatorService {

	final Logger logger = LoggerFactory
			.getLogger(FileObfuscatorServiceImpl.class);

	@Override
	public void obfuscateFile(String inputFile, String outputFile) {

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(
						outputFile))) {
			
			// Get the header row
			String line = br.readLine();
			
			

		} catch (IOException e) {
			logger.error("Ruh roh, an IOException occurred " + e);
			e.printStackTrace();
		}

	}
}
