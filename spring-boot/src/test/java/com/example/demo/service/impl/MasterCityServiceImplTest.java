package com.example.demo.service.impl;

import com.example.demo.domain.City;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MasterCityServiceImplTest {
    @Resource(name = "masterCityServiceImpl")
    MasterCityServiceImpl masterCityService;

    @Test
    public void findCityByName() throws Exception {
        City city = masterCityService.findCityByName("taizhou");
        System.out.println(city.toString());
        Assert.assertNotNull(city);
    }

    @Test
    public void findCityByName2() {
        City city = masterCityService.findCityByName2("台州");
        System.out.println(city);
        Assert.assertNotNull(city);
    }

    @Test
    public void update() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                try {
                    int num = masterCityService.update("taizhou", "Taizhou is a beautiful city");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                countDownLatch.countDown();
            });
        }
        executorService.shutdown();

        countDownLatch.await();
        Assert.assertEquals(countDownLatch.getCount(), 0);
    }


}