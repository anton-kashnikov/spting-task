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
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAllAnimals() {
        return animalRepository.getAnimals();
    }

    public List<Bear> getAllBears() {
        return animalRepository.getBears();
    }

    public List<Lion> getAllLions() {
        return animalRepository.getLions();
    }

    public List<Tiger> getAllTigers() {
        return animalRepository.getTigers();
    }

}
