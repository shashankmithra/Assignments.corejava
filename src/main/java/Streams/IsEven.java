package Streams;

import java.util.Scanner;

public class IsEven {
 public static boolean even(int number){
	 boolean b=(number %2==0)? true:false;
	 return b;
 }
//	 Scanner sc =new Scanner (System.in);
//	 boolean b=false;
//	 System.out.println("enter a number");
//	 int number =sc.nextInt();
//	 if(number%2==0){
//		 b=true;
//	 }
//	 return b;
//   
// }
// 
	public static void main(String[] args) {
//		//IsEven ev=new IsEven();
//		System.out.println(even());
		Scanner sc =new Scanner (System.in);
		int number =sc.nextInt();
		System.out.println(even(number));
		
	}


}
