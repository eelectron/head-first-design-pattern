package state;

public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public int dispense();
}