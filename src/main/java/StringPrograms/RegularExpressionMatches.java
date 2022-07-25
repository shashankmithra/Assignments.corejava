package StringPrograms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpressionMatches {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String strone=sc.next();
        System.out.println("enter the Pattern");
        String strTwo=sc.next();
        System.out.println(Pattern.matches(strTwo,strone));
		

	}
	}


