package ArraysDemo;

import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size of an array :");
		int size=sc.nextInt();
		//create an array
		int[]arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<size;i++){
			
			for(int k=0;k<size-1;k++){
				if(arr[k]>arr[k+1]){
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;	
				}
			}
		}
       // for printing sorted array
		for(int m=0;m<size;m++){
			System.out.println("a["+m+"]="+arr[m]);
			sc.close();
		}
	}

}
