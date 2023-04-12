package com.mszekalski.checkweather;

public class WeatherDtoMapper {

    public static Weather map(WeatherDto weatherDto) {
        Weather weather = new Weather();
        weather.setCity(weatherDto.getName());
        weather.setCountry(weatherDto.getSys().get("country"));
        weather.setDescription(weatherDto.getWeather().get(0).get("description"));
        weather.setIcon("http://openweathermap.org/img/wn/" + weatherDto.getWeather().get(0).get("icon") + "@4x.png");
        weather.setTemp(weatherDto.getMain().get("temp"));
        weather.setPressure(weatherDto.getMain().get("pressure"));
        weather.setHumidity(weatherDto.getMain().get("humidity"));
        weather.setWindSpeed(weatherDto.getWind().get("speed"));

        return weather;
    }
}
