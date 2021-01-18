package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	ArrayList toppings = new ArrayList();
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 min at 350 ");
	}
	
	void cut() {
		System.out.println("cutting pizza diagonally .");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box .");
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}