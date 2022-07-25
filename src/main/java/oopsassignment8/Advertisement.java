package oopsassignment8;

import java.util.Scanner;

public class Advertisement {
	public int advertismentId;
	 public String adDescription;

	 public static void main(String[] args) {
		 Advertisement obj=new Advertisement();
		 Matrimonial mat=new Matrimonial();
		 RealEstate re=new RealEstate();
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter your choice");
		 System.out.println("1.matrimonial adv");
		 System.out.println("2.real estate adv");
		 obj.advertismentId=s.nextInt();
		 switch(obj.advertismentId){
		 case 1:
			    mat.details();
			    System.out.println("matrimony details");
			    System.out.println("gender:"+mat.gender);
		        System.out.println("age:"+mat.age);
		        System.out.println("occupation:"+mat.occupation);
		        break;
		 case 2:
		        re.details();
		        System.out.println("real estate details");
			    System.out.println("real estate type:  "+re.realEstateType);
	            System.out.println("size:"+re.size);
	            System.out.println("price:"+re.price);
	            break;
	     default:System.out.println("enter valid id");
		 }
}}
