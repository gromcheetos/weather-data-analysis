
package com.personal.weather.controller;

import java.io.FileNotFoundException;

public class AppRunner {
	

	public static void main(String[] args) throws FileNotFoundException {
		WeatherDataController controller = new WeatherDataController();
		controller.run();

	}

}
