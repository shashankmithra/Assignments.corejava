package java1.AnotherPackage;

public class Quiz {

	final static short x = 2;
    //public static int y = 0;
    public static void main(String [] args) 
    {
        for (int z=0; z < 3; z++) 
        {
            switch (z) 
            {
                case x: System.out.print("0 ");
                break;
                default: System.out.print("def ");
                break;
                case x-1: System.out.print("1 ");   break;
                           
                case x-2: System.out.print("2 ");
                break;
            }
            
        }
    }
}
