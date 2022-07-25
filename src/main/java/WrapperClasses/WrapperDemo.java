package WrapperClasses;

public class WrapperDemo {

	public static void main(String[] args) {
		//primitive to wrapper
		int a=30;
		Integer i1=Integer.valueOf(a);
		System.out.println(i1);  // wrapper object
		 
		// wrapper to primitive
		Integer i=new Integer("10");
		int b = i.intValue();  // primitive type
		
		// primitive to String
		int c=22;
		String s1=Integer.toString(c); // String
		System.out.println(a+s1);  //3022
		
		//string to primitive
		String s2="33";
		int d=Integer.parseInt(s2);
		System.out.println(s1+s2);
		System.out.println(a+d);
		
		// wrapper to string
		Integer i2=new Integer("111"); // wrapper object
		String s3=i2.toString();   // String
		
		String s4="9999"; // String
		Integer i4=Integer.valueOf(s4); //wrapper 
		System.out.println(s3+i4);
		
		
	}

}
