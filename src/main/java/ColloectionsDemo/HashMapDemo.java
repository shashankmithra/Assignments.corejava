package ColloectionsDemo;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.*;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm =new HashMap<>();
		hm.put(101, "Samsung");
		hm.put(102, "Apple");
		hm.put(103, "Nokia");
		hm.put(104, "One+");
		hm.put(null, "nn");
		System.out.println("HashMap Elements are :"+hm);
		hm.put(102, "Iphone");
		System.out.println("After Duplicate key Add :"+hm);
		System.out.println("hashmap values are :"+hm.get(104));
		Set keys=hm.keySet();
		System.out.println("hashmap keys are :"+keys);
		Collection c=hm.values();
		System.out.println("hashmap values :"+c);
		Set<java.util.Map.Entry<Integer, String>> entries =hm.entrySet();
		System.out.println("Key"+"\t"+"Value");
		System.out.println("-----------------------");
		for(java.util.Map.Entry<Integer, String> e:entries){
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		}

}
