package SamplePrograms;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		System.out.println((num1+num2+num3)/3);
        sc.close();
	}

}
