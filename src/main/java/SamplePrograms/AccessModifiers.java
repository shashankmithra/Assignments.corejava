package SamplePrograms;

public class AccessModifiers {
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;

	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		System.out.println("public:"+obj.a);
		System.out.println("private"+obj.b);
		System.out.println("protected"+obj.c);
		System.out.println("default"+obj.d);

	}

}
 
/*     CONCLUSION
 * 
 * PUBLIC variable is accessible in any class and in any package under same project.
 * 
 * PRIVATE variable is accessible only within that class .
 * 
 * PROTECTED variable is accessible throughout the package as well as in other package if there is inheritance(extends).
 * 
 * DEFAULT variable is accessible only within that package.
 * 
 * 
 */
       