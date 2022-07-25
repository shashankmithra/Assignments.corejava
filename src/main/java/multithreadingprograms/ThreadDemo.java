package multithreadingprograms;

public class ThreadDemo extends Thread {
	public void run(){
		for(int i=6;i<=10;i++){
			System.out.println("inside run method..."+i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void start(){
		super.start();
		System.out.println("---start method---");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t = new ThreadDemo();
		t.setName("shashi");
		t.start();
		//t.run1();
		//t.run();
		for(int i=1;i<=5;i++){
			System.out.println("inside main method..."+i+" "+Thread.currentThread().getName());
		}
	}

}
