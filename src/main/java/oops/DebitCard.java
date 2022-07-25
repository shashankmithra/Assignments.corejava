package oops;
  //Encapsulation = data hiding + data Abstraction
public class DebitCard {
	// Data Hiding
	private int pinNumber;
 
	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public static void main(String[] args) {
		DebitCard VisaCard=new DebitCard(); //obj=instance of class
		VisaCard.setPinNumber(123456);
		System.out.println("your visa card pin number =" +VisaCard.getPinNumber());

	}

}
