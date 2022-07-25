package langpac;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter an input String");
		String input=sc.next();
		System.out.println("Before Reverse : "+input);
		String output="";
		for(int i=input.length()-1;i>=0;--i){
			output+=input.charAt(i);
		}
        System.out.println("After Reverse :"+output);
	}

}
