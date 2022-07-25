package ColloectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkesListDemo {

	public static void main(String[] args) {
		LinkedList<Comparable> ll=new LinkedList<Comparable>();
		ll.add(10);
		ll.add(null);
		ll.add("ojas");
		ll.add('b');
		ll.add(false);
		System.out.println("LinkedList elements are :"+ll);
		ll.addFirst(1000);
		ll.addLast(2000);
		ll.add(3, 5000);
		System.out.println("LinkedList Elements are :"+ll);
		System.out.println("---descending order--------");
		Iterator<Comparable> it=ll.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		HashSet<Comparable> hs =new HashSet<Comparable>();
		hs.add(10);
		hs.add(25);
		ll.addAll(hs);
		System.out.println("After adding hashset in linkedlist :"+ll);
		
	}

}
