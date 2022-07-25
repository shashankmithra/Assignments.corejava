package oopsAssignments;
 //Encapsulation=Data Hiding+ Data Abstraction
public class Assignment_1 {
	//Data Hiding=private
	private int studentId;
	private String name;
	 private long mobileNo;
	 private String address;
	 private String course;
	
	//Data Abstraction=Setters+Getters 
	 public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	

public double calculateFee(String course){
	double fee= 0;
	if(course.equals("java")){
		fee = 15000;
	}
	else if(course.equals("ui")){
		fee =12000;
	}
	else if(course.equals("testing")){
		fee = 10000;
	}

	return fee;
}
}
