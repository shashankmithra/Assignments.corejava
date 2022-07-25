package SamplePrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1=4,num2=6,temp;
		System.out.println("before swapping:"+num1+num2);
		//swapping using temp
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping:"+num1+num2);
		 
		int n1=2,n2=5;
		System.out.println("before swapping:"+n1+n2);
		//swapping without using temp
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after swapping:"+n1+n2);

	}

}
