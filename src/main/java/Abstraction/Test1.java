package Abstraction;

public class Test1 {

	public static void main(String[] args) {
		String s="abcabcbb";
		//String s2="abcb";
		//check(s,s2);
		String[] s1=s.split(" ");
//		s1[0]= a;
//		s1[0]=b;
		System.out.println("length of array : "+s1.length);
		for(int i=0;i<s1.length;i++) 
		 { 
		 System.out.print(s1[i]+"-"); 
		 System.out.println(s1[i].length());
		 } 
		 int max=0; 
		 for(int i=0;i<s1.length;i++) 
		 { 
		 if(s1[i].length()>max) 
		 { 
		 max=s1[i].length(); 
		 } 
		 } 
		 System.out.print("The longest word from the string : "+max); 
		}

	
		
	}

	
	

