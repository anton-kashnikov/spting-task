package com.example.springtask.entity;

public class Lion extends Animal {

    public Lion() {
        super();
    }

    public Lion(Long id, String name, Integer age, Double currentSatiety, Double maxSatiety) {
        super(id, name, age, currentSatiety, maxSatiety, "Lion");
    }
}
