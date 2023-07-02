package files1;

import java.io.File;
import java.io.IOException;

public class Prg3 {
      public static void main(String args[]) throws IOException
      {
    	  File dir1=new File("nages");
    	  System.out.println(dir1.isDirectory());
    	  dir1.mkdir();
    	  System.out.println("dir1 is referring to nages directory:"+dir1.isDirectory());
    	  File f1=new File(dir1,"javanotes.txt");
    	  f1.createNewFile();
    	  System.out.println("f1 is referring to javanotes file in nages directory:"+f1.isFile());
      }
}
