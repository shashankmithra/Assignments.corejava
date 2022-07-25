package ColloectionsDemo;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<Comparable> s=new Stack<Comparable>();
		s.add(101);
		s.add(201);
		s.add("ojas");
		s.add("iinovative");
		s.add("ramu");
		s.add(10234);
		System.out.println("Stack elements"+s);
		s.push("darling");
		s.push("NAMO");
		System.out.println(s);
		s.peek();
		System.out.println(s);
		s.pop();
		System.out.println("-----");
        System.out.println(s);
        System.out.println("after peek"+s);
		s.pop();
	}

}
