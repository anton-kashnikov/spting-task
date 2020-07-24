package com.javarush.zoo.controller;

import com.javarush.zoo.entity.Animal;
import com.javarush.zoo.entity.Bear;
import com.javarush.zoo.entity.Lion;
import com.javarush.zoo.entity.Tiger;
import com.javarush.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/count")
    public Integer getAllCount() {
        return animalService.getAnimalsCount();
    }

    @GetMapping("/bears/count")
    public Integer getAllBearsCount() {
        return animalService.getBearsCount();
    }

    @GetMapping("/lions/count")
    public Integer getAllLionsCount() {
        return animalService.getLionsCount();
    }

    @GetMapping("/tigers/count")
    public Integer getAllTigersCount() {
        return animalService.getTigersCount();
    }

    @GetMapping("/bears/{id}")
    public Bear getBearById(@PathVariable Long id) {
        return animalService.getBearById(id);
    }

    @GetMapping("/lions/{id}")
    public Lion getLionById(@PathVariable Long id) {
        return animalService.getLionById(id);
    }

    @GetMapping("/tigers/{id}")
    public Tiger getTigerById(@PathVariable Long id) {
        return animalService.getTigerById(id);
    }

    @PostMapping("/bears")
    public Bear saveBear(@RequestBody Bear bear) {
        return animalService.saveBear(bear);
    }

    @PostMapping("/lions")
    public Lion saveLion(@RequestBody Lion lion) {
        return animalService.saveLion(lion);
    }

    @PostMapping("/tigers")
    public Tiger saveTiger(@RequestBody Tiger tiger) {
        return animalService.saveTiger(tiger);
    }

}
 