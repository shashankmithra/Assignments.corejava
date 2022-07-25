package SamplePrograms;

public class Switch {

	public static void main(String[] args) {
		int i=2;
		Switch s=new Switch();		
		int result=s.positive(i);
		switch(result) {
		case 1:System.out.println("positive number");
		       break;
		case 0:System.out.println("negitive number");
		       break;
		}
  
	}
      public int positive(int j) {
    	  
    	  if(j>0) j=1;
    	  else j=0;
    	  return j;
      }
}
