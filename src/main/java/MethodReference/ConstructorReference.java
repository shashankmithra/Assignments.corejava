package MethodReference;
interface method3{
	public void method();
}

public class ConstructorReference {
	  ConstructorReference(){
		 System.out.println("constructor reference");
	 }

	public static void main(String[] args) {
		
		method3 cr=ConstructorReference::new;             //here constructor is passed as a reference instead of method
		
             cr.method();
	}

}
