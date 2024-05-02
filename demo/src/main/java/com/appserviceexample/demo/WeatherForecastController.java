package com.appserviceexample.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForecastController {
    @RequestMapping
    public WeatherForecast getWeatherForecast() {
        String[] weatherConditions = {"sunny", "cloudy", "rainy", "snowy"};
        int temperature = (int) (Math.random() * 50);

        WeatherForecast forecast = new WeatherForecast();
        forecast.setTemperature(temperature);

        if (temperature > 30) {
            forecast.setCondition(weatherConditions[0]);
        } else if (temperature > 20) {
            forecast.setCondition(weatherConditions[1]);
        } else if (temperature > 10) {
            forecast.setCondition(weatherConditions[2]);
        } else {
            forecast.setCondition(weatherConditions[3]);
        }

        return forecast;
    }
}
