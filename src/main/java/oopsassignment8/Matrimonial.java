package oopsassignment8;

import java.util.Scanner;

public class Matrimonial extends Advertisement{
	public String gender;
	 public int age;
	 public String occupation;
	
	public void details(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter gender");
  		String gender=s.next();
  		this.gender=gender;
  		System.out.println("enter age");
  		int age=s.nextInt();
  		this.age=age;
  		System.out.println("enter occupation");
  		String occupation=s.next();
  		this.occupation=occupation;
	}
}
