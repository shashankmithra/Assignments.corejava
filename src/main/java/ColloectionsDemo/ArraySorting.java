package ColloectionsDemo;

import java.util.*;

class Student implements Comparable<Student> {
	public int sid;
	public String sname;
	public int marks;

	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return -s.sname.compareTo(sname);
//		if (marks > s.marks) {
//			return -1;
//		} else if (marks < s.marks) {
//			return +1;
//		} else {
//			return 0;
//		}

	}
}

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr = { 10, 35, 20, 2, 12, 12, 89, 90 };
		System.out.println("Without Sorting Array elements are");
		for (int k : arr) {
			System.out.println(k);
		}
		Arrays.sort(arr);
		System.out.println("After Sorting Array Elements ");
		for (int k : arr) {
			System.out.println(k);
		}
		int result = Arrays.binarySearch(arr, 89);
		System.out.println("Index =>" + result);
		Student[] students = new Student[3];
		students[0] = new Student(101, "avinash", 22088);
		students[1] = new Student(201, "mithra", 22080);
		students[2] = new Student(301, "anand", 22055);
		System.out.println("---Students Array List---");
		for (Student s : students) {
			System.out.println(s.sid + "\t" + s.sname + "\t" + s.marks);
		}
		Arrays.sort(students);
		System.out.println("After sorting students ");
		for (Student s : students) {
			System.out.println(s.sid + "\t" + s.sname + "\t" + s.marks);
		}

	}

}
