package java1.exceptionhandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		System.out.println("first line");
		try {
			
			//System.out.println("last line");     //here the last line will not be printed
			int arr[]={1,2,3,4};
			try {
				System.out.println(arr[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inner try block execution handled");
			}
			int a=10/0;
			
		} catch (ArithmeticException e) {
			
			System.out.println("outer try block exception handled");
		}
		

	}

}
