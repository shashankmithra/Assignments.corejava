package SamplePrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num,i;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
