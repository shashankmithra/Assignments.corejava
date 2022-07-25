package iostreams;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Studnet Number ?");
	        String snumber = sc.next();
	        while(!Pattern.matches("[0-9]{4}", snumber)){
	            System.err.println("Student Number must be 4 digits");
	            snumber = sc.next();
	        }
	        int sno = Integer.parseInt(snumber);
	        System.out.println("Enter Student Name ?");
	        String sname = sc.next();
	        while(!Pattern.matches("^[A-Z][a-z]*", sname)){
	            System.err.println("Please Enter Student Name first Character must be Capital");
	            sname = sc.next();
	        }
	        System.out.println("Enter Student Mobile Number ?");
	        String mno = sc.next();
	        while(!Pattern.matches("[0-9]{10}", mno)){
	            System.out.println("Please Enter Mobile Number must be 10 digits");

	        }
	        long mobile = Long.parseLong(mno);
	        System.out.println("Student Number = "+sno);
	        System.out.println("Student Name   = "+sname);
	        System.out.println("Student Mobile No = "+mobile);

	    }

	}


