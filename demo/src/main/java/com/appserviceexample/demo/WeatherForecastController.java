package com.appserviceexample.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForecastController {
	@RequestMapping
	public String getWeatherForecast() {
		String[] weatherConditions = {"sunny", "cloudy", "rainy", "snowy"};
		int temperature = (int) (Math.random() * 50);
		if (temperature > 30) {
			return "The weather is " + weatherConditions[0] + " and the temperature is " + temperature + " degrees Celsius.";
		} else if (temperature > 20) {
			return "The weather is " + weatherConditions[1] + " and the temperature is " + temperature + " degrees Celsius.";
		} else if (temperature > 10) {
			return "The weather is " + weatherConditions[2] + " and the temperature is " + temperature + " degrees Celsius.";
		} else {
			return "The weather is " + weatherConditions[3] + " and the temperature is " + temperature + " degrees Celsius.";
		}
	}
}
