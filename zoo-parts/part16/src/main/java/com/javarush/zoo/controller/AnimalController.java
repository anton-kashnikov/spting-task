package com.javarush.zoo.controller;

import com.javarush.zoo.entity.Animal;
import com.javarush.zoo.entity.Bear;
import com.javarush.zoo.entity.Lion;
import com.javarush.zoo.entity.Tiger;
import com.javarush.zoo.service.AnimalService;
import com.javarush.zoo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    private final AnimalService animalService;
    private final FoodService foodService;

    @Autowired
    public AnimalController(AnimalService animalService, FoodService foodService) {
        this.animalService = animalService;
        this.foodService = foodService;
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

    @DeleteMapping("/bears/{id}")
    public Long deleteBearById(@PathVariable Long id) {
        return animalService.deleteBearById(id);
    }

    @DeleteMapping("/lions/{id}")
    public Long deleteLionById(@PathVariable Long id) {
        return animalService.deleteLionById(id);
    }

    @DeleteMapping("/tigers/{id}")
    public Long deleteTigerById(@PathVariable Long id) {
        return animalService.deleteTigerById(id);
    }

    @PostMapping("/feed")
    public List<Animal> feedAll(@RequestBody Double foodCount){
        return foodService.feedAll(foodCount);
    }

    @PostMapping("/bears/feed")
    public List<Bear> feedAllBears(@RequestBody Double foodCount){
        return foodService.feedAllBears(foodCount);
    }

    @PostMapping("/lions/feed")
    public List<Lion> feedAllLions(@RequestBody Double foodCount){
        return foodService.feedAllLions(foodCount);
    }

    @PostMapping("/tigers/feed")
    public List<Tiger> feedAllTigers(@RequestBody Double foodCount){
        return foodService.feedAllTigers(foodCount);
    }

    @PostMapping("/bears/{id}/feed}")
    public Bear feedBearById(@PathVariable Long id, @RequestBody Double foodCount){
        return foodService.feedBearById(id, foodCount);
    }

    @PostMapping("/lions/{id}/feed}")
    public Lion feedLionById(@PathVariable Long id, @RequestBody Double foodCount){
        return foodService.feedLionById(id, foodCount);
    }

    @PostMapping("/tigers/{id}/feed}")
    public Tiger feedTigerById(@PathVariable Long id, @RequestBody Double foodCount){
        return foodService.feedTigerById(id, foodCount);
    }

}
 