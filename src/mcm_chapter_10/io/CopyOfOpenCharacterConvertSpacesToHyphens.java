package mcm_chapter_10.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CopyOfOpenCharacterConvertSpacesToHyphens {
	
	public CopyOfOpenCharacterConvertSpacesToHyphens(){
	
	}
	
	public String openTestFile() {
		InputStream tis = getClass().getResourceAsStream("../lorem_ipsum.txt");
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader buff = new BufferedReader(new InputStreamReader(tis));){
			int c;
			while((c = buff.read()) != -1){
				if(Character.isSpaceChar((char) c)){
					c = '-';
				}
				sb.append((char) c);
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
			
		return sb.toString();

	}
	
	public static void main(String[] args){
		
		CopyOfOpenCharacterConvertSpacesToHyphens ofd = new CopyOfOpenCharacterConvertSpacesToHyphens();
		
		System.out.println("** File: ***");
		
		System.out.println(ofd.openTestFile());
		
	}
}
