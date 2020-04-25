package com.pattern.observer;

import com.pattern.subject.WeatherSubject;

public class ForecastDisplay implements WeatherObserver, DisplayElement {
	private float humidity;
	private float temperature;
	private WeatherSubject weatherSubject;
	
	public ForecastDisplay(WeatherSubject weatherSubject) {
		this.weatherSubject = weatherSubject;
		this.weatherSubject.registerObserver(this);
	}
	
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Updating Temperature and humidity");
		this.humidity = humidity;
		this.temperature = temperature;
		System.out.println("Temperature:"+temperature);
		System.out.println("Humidity:"+humidity);
		display();
	}

	@Override
	public void display() {
		System.out.println("Displaying Forecast !!!!");
		System.out.println("Temperature Forecast"+Float.sum(new Float(2), this.temperature));
		System.out.println("Humidity Forecast"+Float.sum(new Float(1), this.humidity));
	}
	
}
