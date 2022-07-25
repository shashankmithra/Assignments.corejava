package ColloectionsDemo;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack st = new Stack();
		Scanner sc = new Scanner(System.in);
		int elements = 0, pos = 0;
		System.out.println("-----------------------------");
		System.out.println("|    STACK OPERATIONS       |");
		System.out.println("-----------------------------");
		System.out.println("| 1. PUSH AN ELEMENT        |");
		System.out.println("| 2. POP AN ELEMENT         |");
		System.out.println("| 3. SEARCH AN ELEMENT      |");
		System.out.println("| 4. EXIT                   |");
		System.out.println("-----------------------------");
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		Object element;
		switch (choice) {
		case 1:
			System.out.println("enter an element ?");
			element = sc.nextInt();
			st.push(element);
			System.out.println("Stack elements are :" + st);
			break;
		case 2:
			st.pop();
			System.out.println("Stack elements are :" + st);
			break;
		case 3:
			System.out.println("enter search element ?");
			pos=st.search(sc.nextInt());
			System.out.println("your element @ "+pos);
			break;
		case 4:
			System.exit(0);
			break;

		}
	}

}
