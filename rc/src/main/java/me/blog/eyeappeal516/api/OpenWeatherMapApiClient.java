package me.blog.eyeappeal516.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherMapApiClient {

    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://api.openweathermap.org/data/2.5/weather?1={sityName}&appid={apiKey}":

    public String getCurrentWeather(String cityName){
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, String.class, cityName, 3e5c5a1a4b622c170454494b754b81ba)
                .getBody();
    }

}
