package Abstraction;

abstract class Bike {
	public void color() {
		System.out.println("Blue Color");
	}

	public abstract void run();
}

class ActiveHonda extends Bike {
	public void run() {
		System.out.println("Good for hyd roads");
	}
}

class FZ extends Bike {
	public void run() {
		System.out.println("Feels Like Sports Bike");
	}
}

class Splender extends Bike {
	public void run() {
		System.out.println("Gives Good Mileage");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Bike b = new ActiveHonda();
		b.color();
		b.run();
		Bike b1 = new FZ();
		b1.color();
		b1.run();
		Bike b2 = new Splender();
		b2.color();
		b2.run();

	}

}
