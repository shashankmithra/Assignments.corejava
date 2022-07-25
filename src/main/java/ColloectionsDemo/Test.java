package ColloectionsDemo;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<Object> q1=new PriorityQueue<>(); 
		q1.add("JAVA"); 
		q1.add("HTML"); 
		q1.add("CSS"); 
		q1.add("SOAP"); 
		q1.add("AWS"); 
		q1.add("Selenium"); 
		System.out.println(q1.peek()); 
		System.out.println(q1.poll()); 
		//System.out.println(q1.contains("AWS")); 
	}

}
