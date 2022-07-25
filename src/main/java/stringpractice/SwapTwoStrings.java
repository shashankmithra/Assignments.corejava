package stringpractice;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter first string:");
		String str1=s.next();
		
		System.out.println("enter second string:");
		String str2=s.next();
		
		System.out.println("before swapping:"+str1+" "+str2);
		
		String temp;
		temp=str1;
		str1=str2;
		str2=temp;
		
		System.out.println("after swapping strings:"+str1+" "+str2);

	}

}
