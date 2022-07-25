package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestOne {

	public static void main(String[] args) {
		// Create a list of Integers in first way
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(42);
		list1.add(85);
		list1.add(20);
		list1.add(90);
		list1.add(100);
		System.out.println("List-1" + list1);
		// we can add integers after printing
		list1.add(200);
		System.out.println("List-1" + list1);

		// create a list of integers in 2nd way
		List<Integer> list2 = Arrays.asList(11, 22, 44, 85, 95, 75, 32, 65, 88);
		System.out.println("List-2" + list2);
		// Not valid for java1.8version so 2
		// List<Integer> list3=List.of(2,1,5,4,6,1,11);

		// without Stream api i need to find even numbers
		List<Integer> listEven = new ArrayList<>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		System.out.println("List of Even Numbers :" + listEven);

		// with stream api
		Stream<Integer> stream = list1.stream();
		List<Integer> newEvenlist=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("list of even numbers using api stream"+newEvenlist);
	}

}
