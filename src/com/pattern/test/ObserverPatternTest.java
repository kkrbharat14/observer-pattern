package com.pattern.test;

import com.pattern.observer.CurrentConditionsDisplay;
import com.pattern.observer.ForecastDisplay;
import com.pattern.subject.WeatherData;

public class ObserverPatternTest {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(new Float(25), new Float(10), new Float(15));
		weatherData.setMeasurements(new Float(15), new Float(10), new Float(15));
	}
}
