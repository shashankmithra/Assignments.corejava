package SamplePrograms;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		float length,breadth;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		length=sc.nextFloat();
		System.out.println("enter breadth");
		breadth=sc.nextFloat();
		System.out.println("area is"+length+"*"+breadth+"="+length*breadth);
		System.out.println("perimeter is"+"2"+"*"+(length+"+"+breadth)+"="+2*(length+breadth));
	}

}
