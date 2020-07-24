package com.javarush.zoo.service;

import com.javarush.zoo.dao.AnimalRepository;
import com.javarush.zoo.entity.Animal;
import com.javarush.zoo.entity.Bear;
import com.javarush.zoo.entity.Lion;
import com.javarush.zoo.entity.Tiger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> getAllAnimals(Double minCurrentSatiety, Double maxCurrentSatiety, Double minFullSatiety, Double maxFullSatiety) {
        List<Animal> animals = new ArrayList<>(animalRepository.getAnimals());
        if (!isNull(minCurrentSatiety)) {
            animals.removeIf(animal -> animal.getCurrentSatiety() < minCurrentSatiety);
        }
        if (!isNull(maxCurrentSatiety)) {
            animals.removeIf(animal -> animal.getCurrentSatiety() > maxCurrentSatiety);
        }
        if (!isNull(minFullSatiety)) {
            animals.removeIf(animal -> animal.getFullSatiety() < minFullSatiety);
        }
        if (!isNull(maxFullSatiety)) {
            animals.removeIf(animal -> animal.getFullSatiety() > maxFullSatiety);
        }
        return animals;
    }

    public List<Bear> getAllBears(Double minCurrentSatiety, Double maxCurrentSatiety, Double minFullSatiety, Double maxFullSatiety) {
        List<Bear> bears = new ArrayList<>(animalRepository.getBears());
        if (!isNull(minCurrentSatiety)) {
            bears.removeIf(bear -> bear.getCurrentSatiety() < minCurrentSatiety);
        }
        if (!isNull(maxCurrentSatiety)) {
            bears.removeIf(bear -> bear.getCurrentSatiety() > maxCurrentSatiety);
        }
        if (!isNull(minFullSatiety)) {
            bears.removeIf(bear -> bear.getFullSatiety() < minFullSatiety);
        }
        if (!isNull(maxFullSatiety)) {
            bears.removeIf(bear -> bear.getFullSatiety() > maxFullSatiety);
        }

        return bears;
    }

    public List<Lion> getAllLions(Double minCurrentSatiety, Double maxCurrentSatiety, Double minFullSatiety, Double maxFullSatiety) {
        List<Lion> lions = new ArrayList<>(animalRepository.getLions());
        if (!isNull(minCurrentSatiety)) {
            lions.removeIf(lion -> lion.getCurrentSatiety() < minCurrentSatiety);
        }
        if (!isNull(maxCurrentSatiety)) {
            lions.removeIf(lion -> lion.getCurrentSatiety() > maxCurrentSatiety);
        }
        if (!isNull(minFullSatiety)) {
            lions.removeIf(lion -> lion.getFullSatiety() < minFullSatiety);
        }
        if (!isNull(maxFullSatiety)) {
            lions.removeIf(lion -> lion.getFullSatiety() > maxFullSatiety);
        }
        return lions;
    }

    public List<Tiger> getAllTigers(Double minCurrentSatiety, Double maxCurrentSatiety, Double minFullSatiety, Double maxFullSatiety) {
        List<Tiger> tigers = new ArrayList<>(animalRepository.getTigers());
        if (!isNull(minCurrentSatiety)) {
            tigers.removeIf(tiger -> tiger.getCurrentSatiety() < minCurrentSatiety);
        }
        if (!isNull(maxCurrentSatiety)) {
            tigers.removeIf(tiger -> tiger.getCurrentSatiety() > maxCurrentSatiety);
        }
        if (!isNull(minFullSatiety)) {
            tigers.removeIf(tiger -> tiger.getFullSatiety() < minFullSatiety);
        }
        if (!isNull(maxFullSatiety)) {
            tigers.removeIf(tiger -> tiger.getFullSatiety() > maxFullSatiety);
        }
        return tigers;
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
