package SamplePrograms;

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		//converting decimal to binary,hexa,octal
		
	  int num;
	  Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  System.out.println("binary number is:"+Integer.toBinaryString(num));
	  System.out.println("hexadecimal number is:"+Integer.toHexString(num));
      System.out.println("octal number is:"+Integer.toOctalString(num));
      
      
      //converting binary,hexa,octal to decimal
      
      String binarynum="1010";
      String hexanum="a";
      String octalnum="17";
      
      System.out.println("binary to decimal:"+Integer.parseInt(binarynum,2));
      System.out.println("hexa to decimal:"+Integer.parseInt(hexanum,16));
      System.out.println("octal to decimal:"+Integer.parseInt(octalnum,8));
      
      
     //converting binary to hexa,octal
      
      String binarynumber="1010";
      int decnum=Integer.parseInt(binarynumber,2);
      System.out.println("decimal number is:"+decnum);
      System.out.println("octal number is:"+Integer.toOctalString(decnum));
      System.out.println("hexa number is:"+Integer.toHexString(decnum));
      
      
	}

}
