package uncheckedexception;

import java.util.Scanner;
class InsufficientFundsException extends RuntimeException{
	InsufficientFundsException(){
		super();
	}
}
public class ThrowsKeyword {
	int balance=10000;
	public void bankBalance(){
		int money;
		Scanner s=new Scanner(System.in);
		System.out.println("enter money");
		money=s.nextInt();
		balance-=money;
		if(balance<0){
			throw new InsufficientFundsException();
		}
		else
			System.out.println("your balance is:"+balance);
	}
	public void exception() throws InsufficientFundsException {
		try {
			bankBalance();
		} catch (Exception e) {
			
			System.out.println("please check your balance before withdrawing the money");
		}
	}
	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.exception();

	}

}
