package com.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	// display() 方法仅用来显示当前的温度和湿度
	@Override
	public void display() {
		System.out.println("*******************************************************");
		System.out.println("Current conditions: " + temperature + "F degredds and " + humidity + "% humidity.");
	}
	
	// 
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
