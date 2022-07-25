package exceptionhandling_assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

class DigitNotAllowedException extends RuntimeException{
}
public class DigitnotAllowed {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.next();
		
		if(Pattern.matches("[A-Za-z]*", name)){
			if(Pattern.matches("[A-Z]*", name)){
				System.out.println("capital letter");
			}
			else
				System.out.println("small letter");
		}
		if(Pattern.matches("[0-9]*", name)){
			throw new DigitNotAllowedException();
		}

	}

}
