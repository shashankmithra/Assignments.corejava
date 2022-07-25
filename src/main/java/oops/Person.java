package oops;

public class Person {
	// common variables
	int age;
	String name;
	//common methods
	public void sleep(){
		if(age<12)
			System.out.println("sleep "+age+" 9hours at least");
		else
			System.out.println("Mr."+name+" Atleast 8 hours");
	}
	public void eat(){
		System.out.println("Eat nice Food");
		
	}
	
	public static void main(String[] args) {
		Person child = new Person(); // obj =instance of class
		child.age=15;
		child.name="shashi";
		child.sleep();
		child.eat();

	}

}
