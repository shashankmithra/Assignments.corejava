package ArraysDemo;

import java.util.Scanner;

public class MultiDimDynamicArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no of rows :");
		int rows=sc.nextInt();
		System.out.println("enter no of coloms");
		int cols=sc.nextInt();
		//create an integer array
		int[][] arr=new int[rows][cols];
		System.out.println("enter array elements :");
		for(int i=0;i<rows;i++){
		  for(int j=0;j<cols;j++){
			  arr[i][j]=sc.nextInt();
			  
		  }
		}
		System.out.println("array elements are :");
		for(int i=0;i<rows;i++){
			int sum=0;
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println("="+sum);
			
	 }	
		System.out.println("-----------------------------");
		int sum=0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(i==j){
					System.out.println(arr[i][j]+" ");
					sum+=arr[i][j];
				}}
				System.out.println();
		}
			System.out.println("diagonal sum ="+sum);
		
	}
}
