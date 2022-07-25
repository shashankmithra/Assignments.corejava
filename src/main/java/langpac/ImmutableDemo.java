package langpac;
 class Emp{
	 public int eid;
	 public String ename;
	 public double salary;
	
	public Emp(int eid, String ename, double salary) { //Constructor
		
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		//System.out.println(eid+" "+ename+" "+salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
 }
 
 
public class ImmutableDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	if(s1==s2){
		System.out.println("s1 and s2 are equal");
	}
	else{
		System.out.println("s1 and s2 are not equal");
	}
	Emp e1=new Emp(100,"shashi",15000);
	Emp e2=new Emp(100,"shashi",15000);
	
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	if(e1.equals(e2)){
		System.out.println("e1 and e2 are equal");
	}
	else{
		System.out.println("e1 and e2 are not equal");
	}
	System.out.println(e1+" "+e2);
	
	}
	

}
