package SamplePrograms;

import java.util.Scanner;

public class test {

	int a, b;

public static void main(String[] args) {
test objSwp= new test();      
try      
{          
			            	Scanner sc=new Scanner(System.in);   
			            	System.out.print("Enter first  number: ");    
			            	objSwp.a=sc.nextInt();        
			            	System.out.print("Enter second number: ");   
			            	objSwp.b=sc.nextInt();          
			            	objSwp.swap(objSwp.a,objSwp.b);          
			            	System.out.println("After swapping  -a: " + objSwp.a + ", b: " + objSwp.b);  
			            	}      
			            catch(Exception E)      
			            {           
			            	System.out.println("Exception: " + E.toString()); 
			            }
}
public int swap( int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		return a;
		
	}


}


