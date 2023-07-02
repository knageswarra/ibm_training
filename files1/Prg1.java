package files1;

import java.io.File;
import java.io.IOException;

public class Prg1 {
	public static void main(String args[]) throws IOException
	{
		File f1=new File("pw.txt");
		System.out.println(f1.exists());
		f1.createNewFile();   // created a physical file using CreateNewFile() method
		System.out.println(f1.exists());
	}

}
