package java1.AnotherPackage;

public class test {

	public static void main(String[] args) {
		test obj=new test();
		obj.start();

	}
   public void start() {
	   long a1[]= {1,2,3};
	   long a2[]=fix(a1);
	   System.out.println(a1[0]+" "+a1[1]+" "+a1[2]);
	   System.out.println(a2[0]+" "+a2[1]+" "+a2[2]);
   }
   long [] fix(long[] a3) {
	    a3[1]=4;
	    return a3;
   }
}
