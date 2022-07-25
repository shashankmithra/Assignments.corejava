package stringmethods;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		String str1="good";
		Scanner s=new Scanner(System.in);
		String str2=s.next();
		
		                                //length
		
		System.out.println("length of the string:"+str1.length());
		
		                               //concat

		String str3=str1.concat(str2);
		System.out.println("the concatenated string:"+str3);
		
		                   //to char array
		
		char[] array=str1.toCharArray();
		for(int i=0;i<array.length;i++) {
			System.out.println("character array of string:"+array[i]);
			
		}
		
		                     //char at
		
		System.out.println("the character at the given index:"+str1.charAt(0));
		
	                         //compare to
		
		System.out.println("the comparision of two strings:"+str1.compareTo(str2));
		
		
		                    //contains
		
		System.out.println("result of contain method:"+str1.contains(str2));
		
		                    //split
		
		String[] split=str1.split("ood");
		for(String i:split) {
			System.out.println(i);
		}
		 
		                    //index of
		
		System.out.println("index of the given character in string:"+str2.indexOf(1));
		
		                      //replace
		
		System.out.println("the replaced string:"+str1.replace('g','G' ));
		
		                        //substring
		
		System.out.println("substring:"+str2.substring(1, 4));
		
		                        //tostring
		
		char[] array1= {'h','i',' ','h','e','l','l','o'};
		System.out.println("converted string:"+array1.toString());
		
		
		
	}        

}
