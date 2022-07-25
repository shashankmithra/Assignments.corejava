package oopsassignment8;

import java.util.Scanner;

public class RealEstate extends Advertisement {
	public String realEstateType;
	public int size;
	public long price;
	public void details(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter real estate type");
		String type=s.next();
		this.realEstateType=type;
		System.out.println("enter size in sq.ft");
		int size=s.nextInt();
		this.size=size;
		System.out.println("enter price");
		long price=s.nextLong();
		this.price=price;
	}
}
