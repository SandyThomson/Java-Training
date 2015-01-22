package mcm_chapter_10.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class OpenByteFileConvertSpacesToHyphens {
	
	public OpenByteFileConvertSpacesToHyphens(){
	
	}
	
	public String openTestFile() {
		InputStream tis = getClass().getResourceAsStream("../lorem_ipsum.txt");
		StringBuilder sb = new StringBuilder();
		
		try (DataInputStream dataIn = new DataInputStream(tis)){
			
			int nextChar;
			while((nextChar = dataIn.read()) != -1){
				
				if(Character.isSpaceChar((char) nextChar)){
					nextChar = '-';
				}
				
				sb.append((char)nextChar);
			}
			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
			
		return sb.toString();

	}
	
	public static void main(String[] args){
		
		OpenByteFileConvertSpacesToHyphens ofd = new OpenByteFileConvertSpacesToHyphens();
		
		System.out.println("** File: ***");
		
		System.out.println(ofd.openTestFile());
		
	}
}
