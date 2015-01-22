package com.selftest;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class OpenFileRandomAccess {

	public String openFile(String filename) {

		try (RandomAccessFile raf = new RandomAccessFile(new File(filename), "r")) {

			raf.seek(31);

			return raf.readLine();

		} catch (IOException e) {
			System.out.println("KABOOM");
			e.printStackTrace();
		}
		return null; // erk
	}

}
