package ArraysDemo;

import java.util.Scanner;

public class StringSorting {


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter string size :");
		int size=sc.nextInt();
		//create a String
		String[] str=new String[size];
		for(int i=0;i<size;i++){
			str[i]=sc.next();
		}
		String temp;
		for(int i=0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(str[j].compareTo(str[j+1])>0){
					temp=str [j];
				    str[j]=str[j+1];
				    str[j+1]=temp;
					
				}
			}
		}
		System.out.println("after sorting the String");
		for(int m=0;m<size;m++){
			System.out.println("a["+m+"]="+str[m]);
			sc.close();
		}
	}

}
