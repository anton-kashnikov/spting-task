package com.javarush.zoo.service;

import com.javarush.zoo.dao.AnimalRepository;
import com.javarush.zoo.dao.FoodRepository;
import com.javarush.zoo.entity.Animal;
import com.javarush.zoo.entity.Bear;
import com.javarush.zoo.entity.Lion;
import com.javarush.zoo.entity.Tiger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final AnimalRepository animalRepository;
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(AnimalRepository animalRepository, FoodRepository foodRepository) {
        this.animalRepository = animalRepository;
        this.foodRepository = foodRepository;
    }

    public List<Animal> feedAll(Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        List<Animal> allAnimals = animalRepository.getAnimals();
        Double portion = existingFoodCount / allAnimals.size();
        allAnimals.forEach(animal -> animal.feed(portion));
        return allAnimals;
    }

    public List<Bear> feedAllBears(Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        List<Bear> allBears = animalRepository.getBears();
        Double portion = existingFoodCount / allBears.size();
        allBears.forEach(bear -> bear.feed(portion));
        return allBears;
    }

    public List<Lion> feedAllLions(Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        List<Lion> allLions = animalRepository.getLions();
        Double portion = existingFoodCount / allLions.size();
        allLions.forEach(lion -> lion.feed(portion));
        return allLions;
    }

    public List<Tiger> feedAllTigers(Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        List<Tiger> allTigers = animalRepository.getTigers();
        Double portion = existingFoodCount / allTigers.size();
        allTigers.forEach(tiger -> tiger.feed(portion));
        return allTigers;
    }

    public Bear feedBearById(Long id, Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        Bear bear = animalRepository.getBearById(id);
        bear.feed(existingFoodCount);
        return bear;
    }

    public Lion feedLionById(Long id, Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        Lion lion = animalRepository.getLionById(id);
        lion.feed(existingFoodCount);
        return lion;
    }

    public Tiger feedTigerById(Long id, Double foodCount) {
        Double existingFoodCount = foodRepository.getFood(foodCount);
        Tiger tiger = animalRepository.getTigerById(id);
        tiger.feed(existingFoodCount);
        return tiger;
    }

    public Double getTotalFoodCount() {
        return foodRepository.getTotalFoodCount();
    }

}
