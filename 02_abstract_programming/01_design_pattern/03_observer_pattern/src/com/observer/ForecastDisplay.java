package com.observer;

public class ForecastDisplay implements DisplayElement, Observer {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same.");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather.");
		}
	}

}
