package java1.exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		              //single try and catch block
		try {
			int exp1=10/0;
		} catch (ArithmeticException ae) {
		System.out.println("divide by zero exception");
		}
		
                   //multiple try-catch block
		int exp2[]={1,2};
		try {
			
			System.out.println(exp2[2]);
		} 
		catch(ArithmeticException ae){
			System.out.println("divide by zero exception");
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("wrong index value");
		}
		
		            //multiple catch block in one line
		int exp3[]={1,2};
		try {
			
			System.out.println(exp3[2]);
		} 
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e){
			System.out.println("divide by zero exception");
		}
	}

}
