package com.mszekalski.checkweather;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String weatherUrl = "https://api.openweathermap.org/data/2.5/weather?units=metric&APPID=5df86ee4680a06336d50219681f2d58d&lang=pl&q=";

    public Weather getWeather(String location) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = weatherUrl + location;
        Weather weather = null;
        try {
            ResponseEntity<WeatherDto> apiResponse = restTemplate.getForEntity(apiUrl, WeatherDto.class);
            weather = WeatherDtoMapper.map(apiResponse.getBody());
        } catch (RestClientException e) {
        }
        return weather;
    }
}
