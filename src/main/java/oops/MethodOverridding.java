package oops;

class CentralGovt {
	public void tax() {
		System.out.println("Central govt tax");
	}
}

class StateGovt extends CentralGovt {
	public void tax() {
		System.out.println("Central Govt tax+State Govt Tax");
	}
}

public class MethodOverridding {

	public static void main(String[] args) {
		CentralGovt c = new StateGovt();
		c.tax();

	}

}
