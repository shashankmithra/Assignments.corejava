package ArraysDemo;

import java.util.Arrays;
import java.util.Scanner;

public class SingDimDynamicArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter integer in array size :");
		int size=sc.nextInt();
		//create an String array
		String[] names=new String[size];
		System.out.println("enter String elements");
		for(int i=0;i<size;i++){
			names[i]=sc.next();
		}
		System.out.println("String array elements are");
		for(String n:names){
			System.out.println(n); 
		}
		Arrays.sort(names);
		System.out.println("after sorting");
		for( String n:names){
			System.out.println(n);
		}

	}

}
