package SamplePrograms;

import java.util.Scanner;

public class SumOfDigitsOfInteger {

	public static void main(String[] args) {
		int num,rem = 0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		num=sc.nextInt();
		while(num>0)
		{
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		}
		System.out.println(sum);
	}

}
