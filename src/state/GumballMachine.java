package state;

public class GumballMachine {
	private State hasQuarterState, noQuarterState, soldState, soldOutState, winnerState;
	
	private int count = 0;
	
	private State state = soldOutState;
	public GumballMachine(int numberOfGumballs) {
		this.count = numberOfGumballs;
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		
		state = noQuarterState;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}
	
	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}
	
	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}
	
	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}
	
	public State getWinnerState() {
		// TODO Auto-generated method stub
		return winnerState;
	}
	
	public State getState() {
		return state;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("Gumball is coming out rolling");
		if(count > 0) {
			count -= 1;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		return count + " " + state.toString();
	}
}
