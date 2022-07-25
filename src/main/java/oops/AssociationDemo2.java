package oops;

class Model{
public String modelname;
public String carcc;
public String carmilage;
public Object model;
public Model(String modelname, String carcc, String carmilage) {



this.modelname = modelname;
this.carcc = carcc;
this.carmilage = carmilage;
}}
class Car{
public String company;
public String rating;
public Model model;
public Car(String name, String rating,Model model ) {



this.company = name;
this.rating = rating;
this.model = model;
}
}
public class AssociationDemo2 {



public static void main(String[] args) {
Model m1=new Model("Tata Neexon","3000cc","25km");
Model m2=new Model("MG Hector","5000cc","15km");
Car c1=new Car("Tata Motors","5star",m1);
Car c2=new Car("Morris Garrage","4 star",m2);



System.out.println("-------------------------------------------");
System.out.println("company :"+c1.company);
System.out.println("rating :"+c1.rating);
System.out.println("Modelname :"+c1.model.modelname);
 System.out.println("carcc :"+c1.model.carcc);
System.out.println("carmilage :"+c1.model.carmilage);
System.out.println("-------------------------------------------");
System.out.println("company :"+c2.company);
System.out.println("rating :"+c2.rating);
System.out.println("Modelname :"+c2.model.modelname);
System.out.println("carcc :"+c2.model.carcc);
System.out.println("carmilage :"+c2.model.carmilage);



}}