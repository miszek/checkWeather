package com.mszekalski.checkweather;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Weather {
    private String city;
    private String country;
    private String icon;
    private String description;
    private BigDecimal temp;
    private BigDecimal pressure;
    private BigDecimal humidity;
    private BigDecimal windSpeed;
}
