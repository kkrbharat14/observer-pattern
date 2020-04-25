package com.pattern.subject;

import com.pattern.observer.WeatherObserver;

public interface WeatherSubject {
	
	public void registerObserver(WeatherObserver observer);
	public void removeObserver(WeatherObserver observer);
	public void notifyObservers();

}
