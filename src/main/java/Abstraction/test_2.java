package Abstraction;
//import java.lang.System;
import java.util.Scanner;

public class test_2 {
  public static boolean isEven(int number){
	  boolean type=false;
	  
	  
	  if(number%2==0){
		  type=true;
  }
	  return type;
  }
  public static String isEvenMethod(){
	  String result="";
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter starting number ?");
	  int start=sc.nextInt();
	  System.out.println("enter end number ?");
	  int end=sc.nextInt();
	  for(int i=start;i<=end;i++){
		  if(isEven(i))
 // String so concatination will happen
		  result=result+i+", ";
	  }
  
  return result;
}
	  public static void main(String[] args) {
   System.out.print(isEvenMethod());
		

	}

}
