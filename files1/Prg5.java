package files1;


//writing data onto file using FileWriter and the data is continuously overridden as we execute the code 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prg5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir=new File("nages");
		
		File f1=new File(dir,"javanotes.txt");
		FileWriter f=new FileWriter(f1);
		f.write(97);
		f.write(" nagesh");
		char a[]= {'g','o','o','d'};
		f.write(a);
		f.close();
		System.out.println("open javanotes to see the results");

	}

}
