package com.javarush.zoo.service;

import com.javarush.zoo.dao.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HungerService {

    private final AnimalRepository animalRepository;

    @Autowired
    public HungerService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

}
