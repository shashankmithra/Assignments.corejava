package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) throws IOException {
		//Source file is attach into input stream
		FileInputStream fis=new FileInputStream("abc.txt");
		//Source filr is attach to output stream
		FileOutputStream fos=new FileOutputStream("pqr.txt");
		int k;
		System.out.println("Reading completed......");
		while((k=fis.read())!=-1){
			fos.write(k);
		}
		System.out.println("Writting completed.....");
		fis.close();
		fos.close();

	}

}
