package mcm_chapter_10.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class OpenCharacterFileDemo {
	
	public OpenCharacterFileDemo(){
	
	}
	
	public String openTestFile() {
		InputStream tis = getClass().getResourceAsStream("../lorem_ipsum.txt");
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader buff = new BufferedReader(new InputStreamReader(tis));){
			String line;
			while((line = buff.readLine()) != null){
				sb.append(line); //uses readline for fun, but not really the best.
				sb.append("\n"); //better to use characters really
			}
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
			
		return sb.toString();

	}
	
	public static void main(String[] args){
		
		OpenCharacterFileDemo ofd = new OpenCharacterFileDemo();
		
		System.out.println("** File: ***");
		
		System.out.println(ofd.openTestFile());
		
	}
}
