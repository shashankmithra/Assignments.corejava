package SamplePrograms;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
	   int num1,num2;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter first number");
	   num1=sc.nextInt();
	   num2=sc.nextInt();
	   if(num1==num2)
		   System.out.println("both are equal");
	   else if(num1>num2)
		   System.out.println(num1+"is greater than"+num2);
	   else
		   System.out.println(num1+"is less than"+num2);
	   

	}

}
