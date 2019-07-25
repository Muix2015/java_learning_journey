package com.observer;

public class StatisticsDisplay implements DisplayElement, Observer {
	
	private float maxTemp = 0.0f;
	private float minTemp = 200f;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		
		if (temp < minTemp) {
			minTemp = temp;
		}
		
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp + ".");
	}

}
