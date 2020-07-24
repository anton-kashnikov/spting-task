package com.javarush.zoo.service;

import com.javarush.zoo.dao.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class SupplyService {

    private final FoodRepository foodRepository;

    @Autowired
    public SupplyService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @PostConstruct
    public void startSupplyProcess() {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new SupplyProcess(), 15, 15, TimeUnit.SECONDS);
    }

    private class SupplyProcess implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            foodRepository.addFood((double) (200 + random.nextInt(101)));
        }
    }
}
