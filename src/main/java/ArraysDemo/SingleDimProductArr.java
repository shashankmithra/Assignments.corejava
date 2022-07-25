package ArraysDemo;

import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product>{
	public int pid;
	public String pname;
	public int qty;
	public double price;
	
	public Product(int pid, String pname, int qty, double price) {
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public String toString(){
		return pid+"\t"+pname+"\t"+qty+"\t"+price;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class SingleDimProductArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter product array size :");
		int size =sc.nextInt();
		// create an product array
		Product[] products=new Product[size];
		System.out.println("enter product elements ?");
		for(int i=0;i<size;i++){
			System.out.println("enter product id :");
			int pid=sc.nextInt();
			System.out.println("enter product name");
			String pname=sc.next();
			System.out.println("enter product qty");
			int qty=sc.nextInt();
			System.out.println("enter product price");
			double price=sc.nextDouble();
		 products[i]=new Product(pid,pname,qty,price); // storing in array product [i]
		}
		System.out.println("-----------Product List------------");
		for(Product p: products){
			System.out.println(p);
		}
		System.out.println("-----Product List after sorting----");
		Arrays.sort(products);
		for(Product product: products){
			System.out.println(product);
		}
		
	}

}
