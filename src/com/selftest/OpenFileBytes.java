package com.selftest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class OpenFileBytes {

	public byte[] openFile(String filename){
		
		try( FileInputStream fis = new FileInputStream(new File(filename));
				ByteArrayOutputStream os = new ByteArrayOutputStream();) {
			
			byte[] buffer = new byte[1024];
			while (fis.read(buffer) != -1) os.write(buffer);

			return os.toByteArray();
			
		} catch (IOException e) {
			System.out.println("KABOOM");
			e.printStackTrace();
		}
		return null; // erk
	}

}
