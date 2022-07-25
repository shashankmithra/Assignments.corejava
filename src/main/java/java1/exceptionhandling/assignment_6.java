package java1.exceptionhandling;

import java.util.Scanner;
class NameNotFoundException extends RuntimeException{
	NameNotFoundException(String msg){
		super(msg);
	}
}

public class assignment_6 {

	public static void main(String[] args) {
		String array[]={"sravani","bhavya","bhagya","pravallika","preeti"};
		String name;
		boolean name1=false;
		Scanner s=new Scanner(System.in);
         System.out.println("enter name");
         name=s.next();
         for(int i=0;i<array.length;i++){
        	 if(array[i].equalsIgnoreCase(name)){
        		  name1=true;
        		 System.out.println("name is at:"+i);
        	 }
         }
         if(name1==false)
        		 throw new NameNotFoundException("enter valid name");	 
        	 } 
	}


