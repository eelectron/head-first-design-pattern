package observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature, humidity;
	private Subject weatherData;
	public CurrentConditionDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions " + temperature + "F degrees" + " " + humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}