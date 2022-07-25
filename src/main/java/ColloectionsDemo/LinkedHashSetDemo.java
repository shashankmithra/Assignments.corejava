package ColloectionsDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(400);
		lhs.add("ojas");
		lhs.add(200);
		lhs.add(new Integer(89));
		lhs.add('e');
		lhs.add(false);
		lhs.add(null);
		lhs.add(200); // duplicates are not allowed
		System.out.println("LinkedHashSet elements are :"+lhs);

	}
}
