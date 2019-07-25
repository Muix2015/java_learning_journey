package com.observable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forcastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(89, 65, 30.5f);
		weatherData.setMeasurements(92, 55, 40.5f);
		weatherData.setMeasurements(82, 70, 28.5f);
	}

}
