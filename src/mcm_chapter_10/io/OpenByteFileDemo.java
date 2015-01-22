package mcm_chapter_10.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class OpenByteFileDemo {
	
	public OpenByteFileDemo(){
	
	}
	
	public String openTestFile() {
		InputStream tis = getClass().getResourceAsStream("../lorem_ipsum.txt");
		StringBuilder sb = new StringBuilder();
		
		try (DataInputStream dataIn = new DataInputStream(tis)){
			
			int nextChar;
			while((nextChar = dataIn.read()) != -1){
				sb.append((char)nextChar);
			}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
			
		return sb.toString();

	}
	
	public static void main(String[] args){
		
		OpenByteFileDemo ofd = new OpenByteFileDemo();
		
		System.out.println("** File: ***");
		
		System.out.println(ofd.openTestFile());
		
	}
}
