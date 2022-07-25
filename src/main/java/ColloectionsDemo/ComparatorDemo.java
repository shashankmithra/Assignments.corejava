package ColloectionsDemo;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Product {
	public String pname;
	public double pqty;
	public double price;
	public Product(String pname, double pqty, double price) {
		
		this.pname = pname;
		this.pqty = pqty;
		this.price = price;
	}
	public String toString(){
		return pname+"\t"+pqty+"\t"+price;
	}
	
}
class ProductbasedSorting implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.pqty>p2.pqty){
		return 1;
	}else if (p1.pqty<p2.pqty){
		return -1;
	}else
		return 0;
	}
}
 class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("Chicken biryani",2,500));
		products.add(new Product("Mutton Biryani",1,350));
		products.add(new Product("Prawns biryani",2,440));
		System.out.println("Product ordered in without sorting");
		for(Product p:products){
			System.out.println(p);
		}
		System.out.println("after sorting");
		Collections.sort(products,new ProductbasedSorting());
		System.out.println("product name based sorting");
		for(Product p:products){
			System.out.println(p);
		}
	}
}



