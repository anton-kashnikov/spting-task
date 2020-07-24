package com.javarush.zoo.entity;

import java.util.Comparator;

public enum AnimalsOrder {
    ID,
    NAME,
    AGE,
    CURRENT_SATIETY,
    FULL_SATIETY;


    //TODO::можливо перенести в клас Animal
    public static Comparator<Animal> getComparator(AnimalsOrder order) {
        if (order == ID) {
            return Comparator.comparing(Animal::getId);
        } else if (order == NAME) {
            return Comparator.comparing(Animal::getName);
        } else if (order == AGE) {
            return Comparator.comparing(Animal::getAge);
        } else if (order == CURRENT_SATIETY) {
            return Comparator.comparing(Animal::getCurrentSatiety);
        } else {
            return Comparator.comparing(Animal::getFullSatiety);
        }
    }

}
