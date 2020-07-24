package com.javarush.zoo.entity;

public class Bear extends Animal {

    public Bear() {
        super();
    }

    public Bear(Long id, String name, Integer age, Double currentSatiety, Double maxSatiety) {
        super(id, name, age, currentSatiety, maxSatiety, "Bear");
    }

}
