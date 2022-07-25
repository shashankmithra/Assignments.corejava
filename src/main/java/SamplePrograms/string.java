package SamplePrograms;

public class string {

	public static void main(java.lang.String[] args) {
		string p = new string();
	        p.start();
	    }

	    void start() 
	    {
	        String s1 = "slip";
	        String s2 = fix(s1);
	        System.out.println(s1 + " " + s2);
	    }

	    String fix(String s1) 
	    {
	        s1 = s1 + "stream";
	        System.out.print(s1 + " ");
	        return "stream";
	    }

	}


