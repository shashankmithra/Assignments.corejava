package SamplePrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		final double pi=3.14;
		float radius;
		System.out.println("enter radius");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextFloat();
		System.out.println("area of circle:"+pi*radius*radius);
		System.out.println("perimeter of circle:"+2*pi*radius);

	}

}
