package iteratorAndComposite;

public class MenuItem {
	double price;
	String name;
	String description;
	boolean vegetarian;
	
	public MenuItem(String name, String desciption, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isPrice() {
		return vegetarian;
	}
}