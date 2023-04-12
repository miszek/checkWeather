package com.mszekalski.checkweather;

import lombok.Data;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
public class WeatherDto {

    private List<Map<String, String>> weather;
    private Map<String, BigDecimal> main;
    private Map<String, BigDecimal> wind;
    private Map<String, String> sys;
    private Double timezone;
    private Long id;
    private String name;
    private Long cod;
}