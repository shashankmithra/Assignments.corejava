package MethodReference;

/**
 * if the interface consists of only 1 method then it is called functional interface.
 * method reference (or)lambda expressions are only used for functional interface. 
 * method reference is used instead of lambda expressions.
 * here the interface is not implemented.
 * so we dont have to override (or)implement the interface method.
 * @author Ojas
 *
 */
interface method1{
	public void method();
}


public class StaticMethodReference {                       //class is not implementing the method interface
	
	public static void staticMethod(){                     //here the method is static 
		System.out.println("this is static method reference");
	}

	public static void main(String[] args) {
		
		method1 obj=StaticMethodReference::staticMethod;       //syntax=> ( intefacename objectname=classname::classmethod)
		
		obj.method();                                      //static method is called

	}

}

                                  