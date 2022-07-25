package oops;

public class MethodOverloading {
	public int add(int i,int j){
		return i+j;
	}
	public int  add(int i,int j,int k){
		return i+j+k;
	}

	public static void main(String[] args) {
		MethodOverloading a=new MethodOverloading();
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,20,30));

	}

}
