package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temp, humidity, pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++) {
			observers.get(i).update(temp, humidity, pressure);
		}
	}
	
	public void measureMentChanged() {
		notifyObservers();
	}
	
	public void setMeasuerment(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measureMentChanged();
	}
}