
// program to count and print number of files present in the directory

package files1;

import java.io.File;

public class Prg4 {
	public static void main(String args[])
	{
		File f=new File("nages");
		int c=0;
		String s[]=f.list();
		for(String s1:s)
		{
			c++;
			System.out.println(s1);
		}
		System.out.println("count is "+c);
	}

}
