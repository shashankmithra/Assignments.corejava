package multithreadingprograms;

public class PriorityCheck extends Thread {
	public void run(){
		System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		PriorityCheck t1 = new PriorityCheck();
		PriorityCheck t2 = new PriorityCheck();
		PriorityCheck t3 = new PriorityCheck();
		// min priority number is 1
		// max priority number is 10
		//default priority number is 5
		t1.setName("First");
		t2.setName("Second");
		t2.setPriority(1);
		t3.setName("Third");
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}

}
