package files1;

import java.io.File;

public class Prg2 {
	public static void main(String args[])
	{
		File dir=new File("pwc");
		System.out.println(dir.exists());
		dir.mkdir();
		System.out.println(dir.exists());
	}

}
