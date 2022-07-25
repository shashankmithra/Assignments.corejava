package langpac;

public class Mutabledemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.append("Hyderabad");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.reverse());
	}

}
