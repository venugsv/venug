package Testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Excel_Operations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File("C:\\Users\\tm\\Desktop\\venu","abc.txt");
		
		
		
		FileWriter fw=new FileWriter(f);
		
		
		
	//	fw.write("heeloo");		fw.write("heeloo");fw.write("123");
	//	BufferedWriter bw = new BufferedWriter(fw);
	//	bw.write("hello");
		
	//	bw.newLine();
		
	//	bw.write(45);
		
	//	bw.flush();
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("hello");
		
		pw.println("hello");
		
		pw.println(45);
		pw.flush();
		
	//	fw.flush();
		fw.close();
		
		

	}

}
