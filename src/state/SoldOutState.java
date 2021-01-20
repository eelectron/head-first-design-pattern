package state;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, we are out of gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("We are sold out");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, we are out of gumball");
	}

	@Override
	public int dispense() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, we are out of gumball");
		return 0;
	}
}
