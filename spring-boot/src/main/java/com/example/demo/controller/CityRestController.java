package com.example.demo.controller;

import com.example.demo.domain.City;
import com.example.demo.service.CityService;
import com.example.demo.service.impl.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestController {

    @Autowired
    private CityServiceImpl cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        //return cityService.findCityByName(cityName);
        City city = new City();
        city.setCityName("Tai Zhou");
        city.setDescription("Tai zhou is a beautiful city");
        return city;
    }

}
