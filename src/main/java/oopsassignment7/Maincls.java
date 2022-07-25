package oopsassignment7;

import java.util.Scanner;

public class Maincls {
	public static void main(String[] args) {
		FinancialPetition fp = new FinancialPetition(1,"noman", "04/01/2021", "jangaon", "jangaon", "Adhar Problem", false, "1000");
		NonFinancialPetition nfp = new NonFinancialPetition(2,"Nani", "06/08/2022", "Warangal", "HNK", "Pan Problem", false, "Nani","06/08/2022");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose Either 1 nor 2..");
		System.out.println("Enter 1 for Financial Petition");
		System.out.println("Enter 2 for Non-Financial Petition");
		int choice = sc.nextInt();
		//while(true) {
			switch(choice){
			case 1:fp.display();
			break;
			
			case 2:nfp.display();
			break;
			
			default:System.out.println("Please enter valid Option");
			}
}}
