package java1.AnotherPackage;

public class TestBoolean {

	public static void main(String[] args) {
		TestBoolean obj=new TestBoolean();
		obj.start();

	}
   public void start() {
	  boolean b1=false;
	  boolean b2=fix(b1);
	  System.out.println(b1+" "+b2);
   }
   boolean fix(boolean b3) {
	   b3=true;
	   return b3;

	}

}
