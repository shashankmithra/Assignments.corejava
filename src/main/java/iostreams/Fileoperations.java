package iostreams;

import java.io.File;
import java.io.IOException;

public class Fileoperations {

	public static void main(String[] args) throws IOException  {
		// create a new file
		File f1 = new File("abc.txt");
		f1.createNewFile();
		// File is available or not
		System.out.println(f1.exists());
		// it is file or not
		System.out.println(f1.isFile());
		// how to create a folder
		File f2 =new File("Mithra");
		f2.mkdir();
		// with in mithra folder create a pqr.txt file
		File f3= new File("Mithra","pqr.txt");
		f3.createNewFile();
		//to display folder inside files/folders names
		File path = new File("C:\\");
		String[] fnames = path.list();
		for(String name:fnames){
			System.out.println(name);
		}

	}

}
