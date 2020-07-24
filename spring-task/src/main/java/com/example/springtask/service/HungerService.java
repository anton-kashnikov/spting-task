package com.example.springtask.service;

import com.example.springtask.dao.AnimalRepository;
import com.example.springtask.entity.Bear;
import com.example.springtask.entity.Lion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class HungerService {

    private final AnimalRepository animalRepository;

    @Autowired
    public HungerService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostConstruct
    public void startHungerProcess(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(new HungerProcess(), 10, 10, TimeUnit.SECONDS);
    }

    public Double getTotalFoodNecessity() {
        return animalRepository.getAnimals().stream().mapToDouble(animal -> animal.getFullSatiety() - animal.getCurrentSatiety()).sum();
    }

    private class HungerProcess implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            animalRepository.getAnimals().forEach(animal -> {
                int delta = (int) Math.round(animal.getFullSatiety() * ((double)(5 + random.nextInt(6)))/100.0);
                Double currentSatiety = animal.getCurrentSatiety();
                if (currentSatiety - delta <= 0) {
//                TODO: уточнити чи це безпечно
                    if (animal instanceof Bear) {
                        animalRepository.deleteBearById(animal.getId());
                    } else if (animal instanceof Lion) {
                        animalRepository.deleteLionById(animal.getId());
                    } else {
                        animalRepository.deleteTigerById(animal.getId());
                    }
                } else {
                    animal.setCurrentSatiety(currentSatiety - delta);
                }
            });
        }
    }
}
