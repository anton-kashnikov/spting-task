package com.javarush.zoo.service;

import com.javarush.zoo.dao.AnimalRepository;
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

    @Autowired
    public FoodService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> feedAll(Double foodCount) {
        List<Animal> allAnimals = animalRepository.getAnimals();
        Double portion = foodCount / allAnimals.size();
        allAnimals.forEach(animal -> animal.feed(portion));
        return allAnimals;
    }

    public List<Bear> feedAllBears(Double foodCount) {
        List<Bear> allBears = animalRepository.getBears();
        Double portion = foodCount / allBears.size();
        allBears.forEach(bear -> bear.feed(portion));
        return allBears;
    }

    public List<Lion> feedAllLions(Double foodCount) {
        List<Lion> allLions = animalRepository.getLions();
        Double portion = foodCount / allLions.size();
        allLions.forEach(lion -> lion.feed(portion));
        return allLions;
    }

    public List<Tiger> feedAllTigers(Double foodCount) {
        List<Tiger> allTigers = animalRepository.getTigers();
        Double portion = foodCount / allTigers.size();
        allTigers.forEach(tiger -> tiger.feed(portion));
        return allTigers;
    }

    public Bear feedBearById(Long id, Double foodCount) {
        Bear bear = animalRepository.getBearById(id);
        bear.feed(foodCount);
        return bear;
    }

    public Lion feedLionById(Long id, Double foodCount) {
        Lion lion = animalRepository.getLionById(id);
        lion.feed(foodCount);
        return lion;
    }

    public Tiger feedTigerById(Long id, Double foodCount) {
        Tiger tiger = animalRepository.getTigerById(id);
        tiger.feed(foodCount);
        return tiger;
    }

}
