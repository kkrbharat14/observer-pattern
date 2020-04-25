package com.pattern.observer;

import com.pattern.subject.WeatherSubject;

public class CurrentConditionsDisplay implements WeatherObserver,DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherSubject weatherSubject;

	public CurrentConditionsDisplay(WeatherSubject weatherSubject) {
		this.weatherSubject = weatherSubject;
		weatherSubject.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Updating Current Conditions Display");
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Temperature"+this.temperature);
		System.out.println("Humidity"+this.humidity);
		System.out.println("Pressure"+this.pressure);
	}
}
