package com.example.demo.controller;

import com.example.demo.domain.City;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityRestControllerTest {
    @Autowired
    CityRestController cityRestController;

    @Test
    public void findOneCity() throws Exception {
        City city = cityRestController.findOneCity("taizhou");
        Assert.assertEquals(city.getDescription(),"my home is taizhou");
        //Assert.assertNull(city);
    }

}