package com.javarush.zoo.entity;

public class Animal {
    private Long id;
    private String name;
    private Integer age;
    private Double currentSatiety;
    private Double fullSatiety;
    private String animal;

    public Animal() {
    }

    public Animal(Long id, String name, Integer age, Double currentSatiety, Double fullSatiety, String animal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.currentSatiety = currentSatiety;
        this.fullSatiety = fullSatiety;
        this.animal = animal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getCurrentSatiety() {
        return currentSatiety;
    }

    public void setCurrentSatiety(Double currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    public Double getFullSatiety() {
        return fullSatiety;
    }

    public void setFullSatiety(Double fullSatiety) {
        this.fullSatiety = fullSatiety;
    }

    public void feed(Double foodCount) {
        if (currentSatiety + foodCount > fullSatiety) {
            currentSatiety = fullSatiety;
        } else {
            currentSatiety += foodCount;
        }
    }
}
