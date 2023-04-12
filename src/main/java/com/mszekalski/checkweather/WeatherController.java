package com.mszekalski.checkweather;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Weather weather = null;
        model.addAttribute("weather", weather);
        return "index";
    }

    @PostMapping("/")
    public String showWeather(Model model, @RequestParam String location) {
        Weather weather = weatherService.getWeather(location);
        model.addAttribute("weather", weather);
        return "index";
    }
}
