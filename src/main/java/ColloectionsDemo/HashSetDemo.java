package ColloectionsDemo;

import java.util.*;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Ojas");
		hs.add(null);
		hs.add(new Integer(222));
		hs.add(100);
		hs.add(200);
		hs.add('s');
		hs.add(true);
		System.out.println("HashSetElements are :"+hs);
		System.out.println(hs.contains("Ojas"));
		System.out.println(hs.remove(222));
		System.out.println("HashSet Elements after removing  are :"+hs);
		System.out.println("Hashset Size is :"+hs.size());
		HashSet hs1=new HashSet();
		hs1.add(301);
		hs1.add("innovative technologies");
		hs1.add(false);
		System.out.println("HashSet2 elements are :"+hs1);
		hs.addAll(hs1);
		System.out.println("After adding all in hs element :"+hs);
		//hs1.clear();
		//System.out.println("after clear second hashset :"+hs1);
		
		System.out.println("Is second hashset is empty :"+hs1.isEmpty());
		hs1.removeAll(hs1);
		System.out.println("after removall in second hashset :"+hs1);
		System.out.println("--------------------------------------");
		System.out.println(hs);
		Iterator it= hs.iterator();
		System.out.println("---hashset elements (iterator)---");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	
		
		
	}

}
