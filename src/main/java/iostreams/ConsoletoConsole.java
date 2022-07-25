package iostreams;

import java.io.IOException;

public class ConsoletoConsole {

	public static void main(String[] args) throws IOException {
		System.out.println("To stop reading type '@'");
		int k;
		while((k=System.in.read())!='@'){
			System.out.print((char)k);
		}

	}

}
