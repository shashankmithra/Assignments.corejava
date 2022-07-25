package Threads;
class Customer{
	public double balance = 15000;
	public synchronized void withdraw(double wamount){
		if(balance >= wamount){
			balance -=wamount;
			System.out.println("Successfully withdraw completed.Updated Balance = "+ balance);
			}else{
				System.out.println("Please wait balance not enough. Please deposit and continue");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance -= wamount;
				System.out.println("Successfully withdraw completed.Updated Balance = " + balance);
			}
	}
	public synchronized void deposit(double damount){
		System.out.println("Current balance :"+ balance);
		balance+=damount;
		System.out.println("Updated balance :"+balance);
		System.out.println("succesfully deposit completed..");
		notify();
	}
}
public class InterthreadCommunication {

	public static void main(String[] args) {
		final Customer c = new Customer();
		Thread t1 =new Thread(){
			public void run(){
				c.withdraw(15000);
			}
				
		};
		t1.start();
		Thread t2 =new Thread(){
			public void run(){
				c.deposit(10000);
			}
		};
		t2.start();
	 
	}
	}


