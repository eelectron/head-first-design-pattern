package template;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}

	abstract void brew();
	abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void pourInCup() {
		System.out.println("Pouring in cup");
	}
}
