package java1.exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class assignment_4 {

	public static void main(String[] args) {
		boolean b=false;
		ArrayList<String> employee=new ArrayList();
		employee.add("sravani");
		employee.add("bhavya");
		employee.add("siri");
		employee.add("supriya");
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String name=s.next();
		Iterator it=employee.iterator();
		while(it.hasNext()){
			if(name.equals(it.next())){
				System.out.println("name is in the employee list");
				b=true;
				
		}}
			if(b==false)
				try {
					throw new NameNotFoundException("enter valid name");
				} catch (Exception e) {
					System.out.println("please enter valid name");
					
				}
			finally{
				employee.add(name);
				System.out.println("name is added to the employee list");
				System.out.println(employee);
			}

	}

}
