package ColloectionsDemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Map <String,Integer> ht=new Hashtable<>();
		ht.put("Ramu", 101);
		ht.put("Sita", 102);
		ht.put("Laxman", 103);
		//ht.put(String key, Integer value)
		
		//ht.put(null, 222);
		//ht.put("Ravan", null);
		System.out.println("Hashtable elements are:"+ht);
		System.out.println(ht.get("Sita"));
		Set Keys=ht.keySet();
		System.out.println("HashTable Keys    :"+Keys);
		Collection c=ht.values();
		System.out.println("HashTable Values  :"+c);
		System.out.println(ht.get("Sita"));
	}

}
