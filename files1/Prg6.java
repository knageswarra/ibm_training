package files1;

//writing data onto file using FileWriter and here the new data is appended at the end of the existing file data
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prg6 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir=new File("nagesh1");
		dir.mkdir();
		File f1=new File(dir,"javanotes1.txt");
		f1.createNewFile();
		FileWriter f=new FileWriter(f1,true);
		f.write(97);
		f.write(" nagesh");
		char a[]= {'g','o','o','d'};
		f.write(a);
		f.write("\n");
		f.write(97);
		f.write("\n");
		f.write(" nagesh");
		char a1[]= {'g','o','o','d'};
		f.write(a1);
		f.close();
		System.out.println("open javanotes to see the results");
}
}
