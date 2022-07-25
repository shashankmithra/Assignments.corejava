package ExceptionDemo;

import java.util.Scanner;

class AgeGapException extends RuntimeException{
	public AgeGapException(String msg){
		System.out.println(msg);
	}
	
}
class teenageException extends RuntimeException{
	teenageException(String m){
		System.out.println(m);
	}
}

public class UncheckedException {
	
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the AGE ");
		int bage=sc.nextInt();
		System.out.println("enter the AGE ");
		int gage=sc.nextInt();
	
		if(bage<15 && gage<21){
			throw new AgeGapException("He is small kid enjoying life");
		} 
		else 
		 { 
			throw new teenageException("Go out with girl friend and destroy life");
		}
		}
	}
