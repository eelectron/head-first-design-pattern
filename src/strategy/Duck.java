package strategy;

public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void swim() {
		System.out.println("All ducks can float , even decoy!");
	}
	
	public abstract void display();
}
