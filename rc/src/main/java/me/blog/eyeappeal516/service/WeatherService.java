package me.blog.eyeappeal516.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private AvailableCityNameService availableCityNameService;

    public List<String> getAvailableCityNames() {
        return availableCityNameService;
    }




}
