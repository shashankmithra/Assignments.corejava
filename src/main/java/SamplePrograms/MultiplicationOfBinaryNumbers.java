package SamplePrograms;

public class MultiplicationOfBinaryNumbers {

	public static void main(String[] args) {
		String binarynum1="110";
		String binarynum2="101";
		int num1,num2,result;
		num1=Integer.parseInt(binarynum1, 2);
		num2=Integer.parseInt(binarynum2, 2);
		result=num1*num2;
		System.out.println("result is:"+Integer.toBinaryString(result));

	}

}
