package com.selftest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopierTryWithResources {

	public void copyFile(String inputFile, String outputFile) {

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(
						outputFile))) {

			int b;
			while ((b = br.read()) != -1) {
				if (b == ' ') {
					bw.write('-');
				} else {
					bw.write(b);
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
