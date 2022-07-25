package SamplePrograms;

import java.util.Scanner;

public class DivideTwoNumbers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		if(num2!=0)
		{
			System.out.println(num1/num2);
		}
		else {System.out.println("not divisable");}
	}

}
