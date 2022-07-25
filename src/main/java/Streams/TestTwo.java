package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class Emp {
	public int employeeId;
	public String employeeName;
	public double Salary;
	//parameterized constructor
	public Emp(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.Salary = salary;
	}
}

public class TestTwo {

//	private static Emp[] arrayofEmps ={ new Emp(80,"Mithra",80000.00),
//										new Emp(81,"Avinash",75000.0),
//										new Emp(99,"eshwar",35000.00)
//										};
//	// stream can be write in 2nd way
//	private static List<Emp> empList= Arrays.asList(arrayofEmps);
//	
//public static void main(String args[]){
//	// stream can be write by index of array
//	Stream.of(arrayofEmps[0],arrayofEmps[1],arrayofEmps[2]);
	public static void main(String args[]){
	List<Emp> empList = new ArrayList<Emp>();
	empList.add(new Emp(100,"Mithra",150000));
	empList.add(new Emp(200,"Avinash",45000.0));
	empList.add(new Emp(300,"Rajesh",88000.0));
	empList.add(new Emp(301,"Ramu",88000.0));
	// displaying more than 60,000 sal
	List<Double> empSalList = empList.stream() //converted in to stream
			                 .filter(e->e.Salary>50000)  // filtering the data
			                 .map(e->e.Salary) //fetching the salary
			                 .collect(Collectors.toList()); //collecting as a List
	System.out.println(empSalList);
	// by mentioning sal we are finding employee name
	empList.stream()
	       .filter(e->e.Salary==45000.0)
	       .forEach(e->System.out.println(e.employeeName));
	//finding the max salary
	Emp maxSalEmp = empList.stream().max((e1,e2)->e1.Salary>e2.Salary?1:-1).get();
	System.out.println(maxSalEmp.Salary);

	Emp minSalEmp = empList.stream()
			               .min((e1,e2)->e1.Salary>e2.Salary?1:-1).get();
	System.out.println(minSalEmp.Salary);
	long count = empList.stream().filter(e->e.Salary>55000).count();
	System.out.println("55000 or above sal employees count :"+count);
	}}
