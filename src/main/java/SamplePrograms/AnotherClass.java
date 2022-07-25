package SamplePrograms;

public class AnotherClass {
	public static void main(String[] args) {
	
	AccessModifiers obj1=new AccessModifiers();
	
	System.out.println("public:"+obj1.a);
	//System.out.println("private:"+obj1.b);      //private variables are not accessible in another class even though in the same package
	System.out.println("protected:"+obj1.c);
	System.out.println("default:"+obj1.d);
	
	
	}

}
