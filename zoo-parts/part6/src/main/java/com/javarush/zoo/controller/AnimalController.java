package com.javarush.zoo.controller;

import com.javarush.zoo.entity.Animal;
import com.javarush.zoo.entity.Bear;
import com.javarush.zoo.entity.Lion;
import com.javarush.zoo.entity.Tiger;
import com.javarush.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
    }

    @GetMapping("/bears")
    public List<Bear> getAllBears(){
        return animalService.getAllBears();
    }

    @GetMapping("/lions")
    public List<Lion> getAllLions() {
        return animalService.getAllLions();
    }

    @GetMapping("/tigers")
    public List<Tiger> getAllTigers(){
        return animalService.getAllTigers();
    }

}
 