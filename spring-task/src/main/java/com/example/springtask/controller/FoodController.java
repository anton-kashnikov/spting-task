package com.example.springtask.controller;

import com.example.springtask.service.FoodService;
import com.example.springtask.service.HungerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;
    private final HungerService hungerService;

    @Autowired
    public FoodController(FoodService foodService, HungerService hungerService) {
        this.foodService = foodService;
        this.hungerService = hungerService;
    }

    @GetMapping("/count")
    public Double getTotalFoodCount(){
        return foodService.getTotalFoodCount();
    }

    @GetMapping("/necessity")
    public Double getTotalFoodNecessity(){
        return hungerService.getTotalFoodNecessity();
    }
}
