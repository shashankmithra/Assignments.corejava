package StringPrograms;

public class Test_2 {
	public String LongestPalindrome(){
		String s="babad";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			//if(reverse.equalsIgnoreCase(reverse)) {
			reverse+=s.charAt(i);
			
	}
		System.out.println(reverse);
		return reverse;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_2 result=new Test_2();
		result.LongestPalindrome();
		

	}

}
