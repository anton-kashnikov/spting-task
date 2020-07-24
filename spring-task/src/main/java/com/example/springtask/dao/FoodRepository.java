package com.example.springtask.dao;

import org.springframework.stereotype.Component;

@Component
public class FoodRepository {
    private Double totalFoodCount = 1000.0;

    public Double getFood(Double foodCount) {
        if (foodCount > totalFoodCount) {
            totalFoodCount = 0.0;
            return totalFoodCount;
        } else {
            totalFoodCount -= foodCount;
            return foodCount;
        }
    }

    public Double addFood(Double foodCount) {
        totalFoodCount += foodCount;
        return totalFoodCount;
    }

    public Double getTotalFoodCount() {
        return totalFoodCount;
    }
}
