package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {

    private String name;


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
