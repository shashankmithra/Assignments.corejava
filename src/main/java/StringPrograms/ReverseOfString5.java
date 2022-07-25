package StringPrograms;

import java.util.Scanner;

public class ReverseOfString5 {

	private String reverse(String input) {
		String output="";
		for(int i=input.length()-1;i>=0;--i){
			output+=input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
//		String s="java";
//		String s1="java";
//		s="developer";
//		String s3="sql";
//		System.out.println(s.concat(s1)+" "+s1+" "+s3);
//        StringBuffer sb=new StringBuffer("shank");
//        sb.append("mithra");
       // System.out.println(sb);
		ReverseOfString5 obj=new ReverseOfString5();
        Scanner sc =new Scanner (System.in);
		System.out.println("Enter an input String");
		String input=sc.next();
		System.out.println("Enter an input String");
		String input1=sc.next();
		System.out.println("Before Reverse : "+input);
		String output=obj.reverse(input); // by reference we are calling
		String output1=obj.reverse(input1);
		System.out.println("After Reverse :"+output);
		System.out.println("After Reverse :"+output1);
		

       }

	}


	
