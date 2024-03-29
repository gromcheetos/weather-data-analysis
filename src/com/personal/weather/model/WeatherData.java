package com.personal.weather.model;

public class WeatherData {

	private String city;
	private String state;
	private int avgTemp;
	private int maxTemp;
	private int minTemp;
	private double windSpeed;

	public WeatherData(String city, String state, int avgTemp, int maxTemp, int minTemp, double windSpeed) {
		this.city = city;
		this.state = state;
		this.avgTemp = avgTemp;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.windSpeed = windSpeed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAvgTemp() {
		return avgTemp;
	}

	public void setAvgTemp(int avgTemp) {
		this.avgTemp = avgTemp;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	
	@Override
	public String toString() {
		return "city: " + city + ", state: " + state + ", avgTemp: " + avgTemp + ", maxTemp: " + maxTemp
				+ ", minTemp: " + minTemp + ", windSpeed: " + windSpeed + "\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		WeatherData dataToCompareWith = ((WeatherData) obj);
		
		if(this.city.equals(dataToCompareWith.city) && this.state.equals(dataToCompareWith.state)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
