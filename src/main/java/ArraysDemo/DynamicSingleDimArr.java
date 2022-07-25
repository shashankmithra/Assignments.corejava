package ArraysDemo;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicSingleDimArr {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter integer in array size :");
		int size=sc.nextInt();
		//Create an integer array
		int[] arr= new int[size];
		System.out.println("enter integer array elements :");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("integer array elements are :");
		for(int k:arr){
			System.out.println(k);
		}
		// after sorting arr
//		System.out.println("sorting integer array elements :");
//		Arrays.sort(arr);
//		for(int j:arr){
//			System.out.println(j);
//		}
	}

}
