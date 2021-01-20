package state;

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random randomNum = new Random(System.currentTimeMillis());
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can not insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned ...");
		int winner = randomNum.nextInt(10);
		if((winner == 0) && gumballMachine.getCount() > 1) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		}
		else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public int dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
		return 0;
	}

}
