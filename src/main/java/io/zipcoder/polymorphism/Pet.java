package io.zipcoder.polymorphism;

public class Pet {
    String name;
    String animalType;

    Pet(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
