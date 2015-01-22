import java.io.*;

public class CopyText {
	public static void main(String args[])
	{
		FileInputStream   in  = null;
		FileOutputStream  out = null;
		
		try{
			in  = new FileInputStream("src/spaces.txt");
			out = new FileOutputStream("src/hyphen.txt");
		    
			int i = 0;
		    
			while(true){
			    i = in.read();
			    if (i == -1) return;
			    else if ( i == ' ' ) { out.write('-'); }
			    else                 { out.write(i);   }
		    }
		}
		catch   (IOException e) { e.printStackTrace(); }
		finally { 
			try{
			  in.close();
			  out.close();
			}
			catch   (IOException e) { e.printStackTrace(); }
		}
	}
}
