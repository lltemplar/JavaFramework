package com.example.demo.service.impl;

import com.example.demo.dao.master.MasterCityDao;
import com.example.demo.domain.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("masterCityServiceImpl")
public class MasterCityServiceImpl implements CityService {
    @Autowired
    private MasterCityDao masterCityDao;

    public City findCityByName(String cityName) {
        return masterCityDao.findByName(cityName);
    }

    public City findCityByName2(String cityName) {
        return masterCityDao.findByName2(cityName);
    }


    public int update(String cityName, String description) {
        return masterCityDao.update(cityName, description);
    }
}
