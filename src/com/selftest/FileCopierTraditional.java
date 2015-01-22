package com.selftest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopierTraditional {

	public void copyFile(String inputFile, String outputFile) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);

			int b;
			while ((b = fis.read()) != -1) {
				if (b == ' ') {
					fos.write('-');
				} else {
					fos.write(b);
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (fos != null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
