package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFilesIntoSingleFile {

	public static void main(String[] args) throws IOException {
		// First Source File is Attach to FileInputStream
		FileInputStream fis1=new FileInputStream("abc.txt");
		// Second Source File is Attach to FileInputStream
		FileInputStream fis2=new FileInputStream("pqr.txt");
		
		// Attach a outputfile to OutPutStream
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		
		//Two Files fis1,fis2 stored in sis (sequesInputstream)
		SequenceInputStream sis =new SequenceInputStream(fis1,fis2);
		//declare byte variable
		int k;
		System.out.println("Reading Started.........");
		while((k=sis.read())!=-1){
			fos.write(k);
			
		}
		System.out.println("Writting is completed.......");
		fis1.close();
		fis2.close();
		fos.close();
		sis.close();
		

	}

}
