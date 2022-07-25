package ColloectionsDemo;

import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(30);
		al.add(new Integer(34));
		al.add('b');
		al.add(true);
		al.add(null);
		al.add(300);
		al.add(30);
		
		System.out.println("ArrayList Elements are :"+al);
		System.out.println("-----forward direction-------");
		ListIterator lt=al.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println("----backward direction----");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
			
		}
	}

}
