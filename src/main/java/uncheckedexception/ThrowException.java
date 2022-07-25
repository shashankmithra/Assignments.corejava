package uncheckedexception;

import java.util.Scanner;

class AgeLimitException extends RuntimeException{
	AgeLimitException(){
		super();
	}
}

public class ThrowException {

	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		age=s.nextInt();
		if(age<18){
			try {
				throw new AgeLimitException();
			} catch (Exception e) {
				System.out.println("your age is not eligible");
				
			}
		}
		else
			System.out.println("eligible");

	}

}
