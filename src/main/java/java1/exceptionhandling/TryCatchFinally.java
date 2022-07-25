package java1.exceptionhandling;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		int a=10;
		int b=0; 
		int c;
		try {
		 
			System.out.println( c=a/b);
			    
		} 
		     //here the arithmetic exception is not handled because the catch exception given is array index out of bounds exception.
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handled");
		}
		           //here the finally statement is printed even if the exception is handled or not.
		
		finally{
			System.out.println("printing without handling the exception");
		}
		

	}

}
