package com.observable;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {}
	
	
	/**
	 * 先调用 SetChanged() 来指示状态已改变
	 * 再调用 notifyObservers() 来通知观察者们
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements (float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
