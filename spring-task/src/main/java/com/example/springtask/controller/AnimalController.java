package com.example.springtask.controller;

import com.example.springtask.entity.*;
import com.example.springtask.service.AnimalService;
import com.example.springtask.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalService animalService;
    private final FoodService foodService;

    @Autowired
    public AnimalController(AnimalService animalService, FoodService foodService) {
        this.animalService = animalService;
        this.foodService = foodService;
    }

    @GetMapping()
    public List<Animal> getAll(@RequestParam(required = false) Double minCurrentSatiety, @RequestParam(required = false) Double maxCurrentSatiety,
                               @RequestParam(required = false) Double minFullSatiety, @RequestParam(required = false) Double maxFullSatiety,
                               @RequestParam(required = false) AnimalsOrder order) {
        return animalService.getAnimals(minCurrentSatiety, maxCurrentSatiety, minFullSatiety, maxFullSatiety, order);
    }

    @GetMapping("/count")
    public Integer getAllCount() {
        return animalService.getAnimalsCount();
    }

    @PostMapping("/feed")
    public List<Animal> feedAll(@RequestBody Double foodCount){
        return foodService.feedAll(foodCount);
    }

    @GetMapping("/bears")
    public List<Bear> getAllBears(@RequestParam(required = false) Double minCurrentSatiety, @RequestParam(required = false) Double maxCurrentSatiety,
                                  @RequestParam(required = false) Double minFullSatiety, @RequestParam(required = false) Double maxFullSatiety,
                                  @RequestParam(required = false) AnimalsOrder order) {
        return animalService.getBears(minCurrentSatiety, maxCurrentSatiety, minFullSatiety, maxFullSatiety, order);
    }

    @GetMapping("/bears/count")
    public Integer getAllBearsCount() {
        return animalService.getBearsCount();
    }

    @PostMapping("/bears/feed")
    public List<Bear> feedAllBears(@RequestBody Double foodCount){
        return foodService.feedAllBears(foodCount);
    }

    @GetMapping("/lions")
    public List<Lion> getAllLions(@RequestParam(required = false) Double minCurrentSatiety, @RequestParam(required = false) Double maxCurrentSatiety,
                                  @RequestParam(required = false) Double minFullSatiety, @RequestParam(required = false) Double maxFullSatiety,
                                  @RequestParam(required = false) AnimalsOrder order) {
        return animalService.getLions(minCurrentSatiety, maxCurrentSatiety, minFullSatiety, maxFullSatiety, order);
    }

    @GetMapping("/lions/count")
    public Integer getAllLionsCount() {
        return animalService.getLionsCount();
    }

    @PostMapping("/lions/feed")
    public List<Lion> feedAllLions(@RequestBody Double foodCount){
        return foodService.feedAllLions(foodCount);
    }

    @GetMapping("/tigers")
    public List<Tiger> getAllTigers(@RequestParam(required = false) Double minCurrentSatiety, @RequestParam(required = false) Double maxCurrentSatiety,
                                    @RequestParam(required = false) Double minFullSatiety, @RequestParam(required = false) Double maxFullSatiety,
                                    @RequestParam(required = false) AnimalsOrder order) {
        return animalService.getTigers(minCurrentSatiety, maxCurrentSatiety, minFullSatiety, maxFullSatiety, order);
    }

    @GetMapping("/tigers/count")
    public Integer getAllTigersCount() {
        return animalService.getTigersCount();
    }

    @PostMapping("/tigers/feed")
    public List<Tiger> feedAllTigers(@RequestBody Double foodCount){
        return foodService.feedAllTigers(foodCount);
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
    public Bear updateOrCreateBear(@RequestBody Bear bear) {
        return animalService.saveBear(bear);
    }

    @PostMapping("/lions")
    public Lion updateOrCreateLion(@RequestBody Lion lion) {
        return animalService.saveLion(lion);
    }

    @PostMapping("/tigers")
    public Tiger updateOrCreateTiger(@RequestBody Tiger tiger) {
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
