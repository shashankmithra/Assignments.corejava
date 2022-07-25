package MethodReference;

interface method2{
	public void method();
}

public class InstanceMethodReference {
	
	public void instanceMethod(){
		System.out.println("this is instance method reference");
	}

	public static void main(String[] args) {
		
		InstanceMethodReference imr=new InstanceMethodReference();    //here the mothod in the class is non static,so we have to create an object for that method
		
		method2 ob=imr::instanceMethod;        //instead of using class name we are using object name
		
		ob.method();                            //here the inteface method is called
		

	}

}
