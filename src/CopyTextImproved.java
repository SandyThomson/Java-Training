import java.io.*;

public class CopyTextImproved {
	public static void main(String args[])
	{
		try ( FileInputStream in   = new FileInputStream("src/spaces.txt");
			  FileOutputStream out = new FileOutputStream("src/hyphen.txt") ){
			int i = 0;
		    
			while(true){
			    i = in.read();
			    if      ( i == -1  ) { return;         }
			    else if ( i == ' ' ) { out.write('-'); }
			    else                 { out.write(i);   }
		    }
		}
		catch   (IOException e) { e.printStackTrace(); }
	}
}
