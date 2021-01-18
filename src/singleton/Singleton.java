package singleton;

public class Singleton {
	private static Singleton uniqueInstance = null;
	private static int x = 0;
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				System.out.println("Created first time");
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		x += 1;
		System.out.println("INstance = " + x);
		return uniqueInstance;
	}
}