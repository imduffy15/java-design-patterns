package ie.ianduffy.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {

	private WeatherType currentWeather;

	private List<WeatherObserver> observers;

	public Weather() {
		observers = new ArrayList<>();
		currentWeather = WeatherType.SUNNY;
	}

	public void addObserver(WeatherObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(WeatherObserver observer) {
		observers.remove(observer);
	}

	public void timePasses() {
		WeatherType[] enumValues = WeatherType.values();
		currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
		System.out.println("The weather changed to " + currentWeather + ".");
		notifyObservers();
	}

	private void notifyObservers() {
		for (WeatherObserver observer : observers) {
			observer.update(currentWeather);
		}
	}
}
