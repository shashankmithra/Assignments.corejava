package ColloectionsDemo;

import java.util.*;

public class VectorDem {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(30);
		v.add(new Integer(34));
		v.add('b');
		v.add(true);
		v.add(null);
		v.add(300);
		v.add("last");
		System.out.println("Vector element "+v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.get(3));
		
	}

}
