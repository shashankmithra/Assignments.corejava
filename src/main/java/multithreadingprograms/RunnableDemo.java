package multithreadingprograms;
class A{
	
}
public class RunnableDemo extends  A implements Runnable {
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("inside run method..."+i);
		}
	}
//	public void run1(){
//			for(char i='a';i<='d';i++){
//				System.out.println("inside run1 method..."+i);
//			}
//		}
	
	public static void main(String[] args) {
		RunnableDemo obj=new RunnableDemo();
		Thread t = new Thread(obj);
		t.start();
		for(int i=6;i<=10;i++){
			System.out.println("inside main method..."+i);
		}
	}
	}


