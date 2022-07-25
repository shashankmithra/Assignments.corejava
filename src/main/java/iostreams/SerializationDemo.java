package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Course implements Serializable {
	public int cid;
	public String cname;

	public Course(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
}

class Student extends Course {
	public Student(int cid, String cname) {
		super(cid, cname);
	}

	public int sid;
	public String sname;
	public int marks;

	public Student(int cid, String cname, int sid, String sname, int marks) {
		super(cid, cname);
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", cid=" + cid + ", cname=" + cname
				+ "]";
	}
}

public class SerializationDemo {

		//serialization
		public void serilizationMethod(Object obj){
			try {
				FileOutputStream fos =new FileOutputStream("student.txt");
				ObjectOutputStream oos =new ObjectOutputStream(fos);
				oos.writeObject(obj);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("seilization is completed.");
		}
		public Object DeserilizationMethod(){
			Object obj =null;
			try {
				FileInputStream fis = new FileInputStream("student.txt");
				ObjectInputStream ois =new ObjectInputStream(fis);
				obj=ois.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;
			
		}
		public static void main(String[] args) {
			SerializationDemo obj =new SerializationDemo();
			
			
	}

}
