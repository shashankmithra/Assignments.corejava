package SamplePrograms;

 class Animal {
	 protected String name;
     protected int age;
     public Animal(String name, int age){
        this.name = name;
        this.age = age;
     }
     public void animalInfo() {
        System.out.println("Animal class info: ");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
     }
}
  class Dog extends Animal {
     public String color;
     public Dog(String name, int age, String color){
        super(name, age);
        this.color = color;
     }
     public void dogInfo() {
        System.out.println("Dog class: ");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Color: "+this.color);
     }
     public static void main(String[] args) {
      Animal animal = new Animal("Leo", 2);
        Dog dog = (Dog) animal; //implicit casting Object of student to person
        dog.animalInfo();
        dog.dogInfo();
     }
}
