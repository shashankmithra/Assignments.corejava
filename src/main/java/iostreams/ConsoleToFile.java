package iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("To stop reading type '@'");
		int k;
		FileOutputStream fos = new FileOutputStream("abc.txt");
		while((k=System.in.read())!='@'){
			fos.write(k);
		}
		System. out.println("writting completed succcesfully....");
	}

}
