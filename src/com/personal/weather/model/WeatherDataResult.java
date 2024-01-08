package com.personal.weather.model;

import java.util.Objects;

public class WeatherDataResult {

	private int temp;

	private String state;

	public WeatherDataResult(int temp, String state) {
		this.temp = temp;
		this.state = state;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherDataResult other = (WeatherDataResult) obj;
		return Objects.equals(state, other.state) && temp == other.temp;
	}

}
