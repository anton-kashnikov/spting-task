package com.javarush.zoo.entity;

public class Tiger extends Animal {

    public Tiger() {
        super();
    }

    public Tiger(Long id, String name, Integer age, Double currentSatiety, Double maxSatiety) {
        super(id, name, age, currentSatiety, maxSatiety, "Tiger");
    }
}
