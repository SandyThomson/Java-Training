package com.selftest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OpenFileCharacters {

	/**
	 * Ok - using Strings here, more or less the same thing, I think..
	 * @param filename
	 * @return
	 */
	public String openFile(String filename) {

		StringBuffer sb = new StringBuffer();

		try (BufferedReader br = new BufferedReader(new FileReader((new File(
				filename))))) {

			String line;

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			
			return sb.toString();

		} catch (IOException e) {
			System.out.println("KABOOM");
			e.printStackTrace();
		}
		return null; // erk
	}

}
