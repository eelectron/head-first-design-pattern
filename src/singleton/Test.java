package singleton;

public class Test {
	public static void main(String[] args) {
		Singleton st = Singleton.getInstance();
		st = Singleton.getInstance();
		st = Singleton.getInstance();
	}
}
