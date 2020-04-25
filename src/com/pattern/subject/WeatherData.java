package com.pattern.subject;

import java.util.ArrayList;
import java.util.List;

import com.pattern.observer.WeatherObserver;

public class WeatherData implements WeatherSubject {

	private float temperature;
	private float humidity;
	private float pressure;
	private List<WeatherObserver> weatherObservers;

	public WeatherData() {
		this.weatherObservers = new ArrayList<WeatherObserver>();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
	
	public void measurementChanged() {
		this.notifyObservers();
	}

	@Override
	public void registerObserver(WeatherObserver observer) {
		this.weatherObservers.add(observer);
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		int index = this.weatherObservers.indexOf(observer);

		if (index >= 0) {
			this.weatherObservers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (WeatherObserver observer : weatherObservers) {
			observer.update(temperature, humidity, pressure);
		}
	}

}
