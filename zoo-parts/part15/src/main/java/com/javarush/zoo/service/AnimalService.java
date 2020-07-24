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


    public Integer getAnimalsCount() {
        return animalRepository.getAnimals().size();
    }

    public Integer getBearsCount() {
        return animalRepository.getBears().size();
    }

    public Integer getLionsCount() {
        return animalRepository.getLions().size();
    }

    public Integer getTigersCount() {
        return animalRepository.getTigers().size();
    }


    public Bear getBearById(Long id) {
        return animalRepository.getBearById(id);
    }

    public Lion getLionById(Long id) {
        return animalRepository.getLionById(id);
    }

    public Tiger getTigerById(Long id) {
        return animalRepository.getTigerById(id);
    }


    public Bear saveBear(Bear bear) {
        return animalRepository.saveBear(bear);
    }

    public Lion saveLion(Lion lion) {
        return animalRepository.saveLion(lion);
    }

    public Tiger saveTiger(Tiger tiger) {
        return animalRepository.saveTiger(tiger);
    }

    public Long deleteBearById(Long id) {
        return animalRepository.deleteBearById(id);
    }

    public Long deleteLionById(Long id) {
        return animalRepository.deleteLionById(id);
    }

    public Long deleteTigerById(Long id) {
        return animalRepository.deleteTigerById(id);
    }

}
