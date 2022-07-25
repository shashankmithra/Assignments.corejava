package java1.exceptionhandling;

public class GetMessage {

	public static void main(String[] args) {
		int a[]={1,2};
		try {
			System.out.println("the value at index is:"+a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();          // to print complete exception message including line number.
			
			System.out.println(e.toString());           //to print the exception message without line number.
			
			System.out.println(e.getMessage());           //to print why it is raising exception
		}
	}

}
