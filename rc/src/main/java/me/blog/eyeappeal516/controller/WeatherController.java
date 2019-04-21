package me.blog.eyeappeal516.controller;

import me.blog.eyeappeal516.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {
    private WeatherService weatherService;

    @GetMapping
    public List<String> getAvailableCities(){
        return weatherService.getAvailableCityNames();
    }
}
