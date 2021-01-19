package command;

public class Light {
	String name;
	public Light(String name){
		this.name = name;
	}
	
	public boolean on() {
		System.out.println("Light On");
		return true;
	}
	
	public boolean off() {
		System.out.println("Light Off");
		return true;
	}
}
