package state;

public class WinnerState implements State{
	GumballMachine gumballMachine;
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Error");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Error");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Error");
	}

	@Override
	public int dispense() {
		// TODO Auto-generated method stub
		System.out.println("You are WINNER. You will get two gumball");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() == 0) {
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
			else {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}
		}
		return 0;
	}

}
