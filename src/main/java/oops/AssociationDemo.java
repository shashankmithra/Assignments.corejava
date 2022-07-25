package oops;
class course{
	public int courseId;
	public String courseName;
	public String duration;
	//public String ;
	public course(int courseId, String courseName, String duration) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
}
	
class student{
	public int studentId;
	public String studentName;
	public course course;
	public student(int studentId, String studentName,course course) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	
}
public class AssociationDemo {

	public static void main(String[] args) {
		course c1=new course(1,"java","3 months");
		course c2=new course(2,"testing","2 months");
		student s1=new student(101,"shashi",c1);
		student s2=new student(102,"hari",c2);
		System.out.println("-------------------------------------------");
		System.out.println("student id      :"+s1.studentId);
		System.out.println("student Name    :"+s1.studentName);
		System.out.println("course Name     :"+s1.course.courseName);
		System.out.println("course Duration :"+s1.course.duration);
		System.out.println("-------------------------------------------");
		System.out.println("student id      :"+s2.studentId);
		System.out.println("student Name    :"+s2.studentName);
		System.out.println("course Name     :"+s2.course.courseName);
		System.out.println("course Duration :"+s2.course.duration);
		
		

	}

}

//course c2=new course(2,"testing","2months");
//course c3=new course(3,"python","1 month");
//
