package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Pet {
<<<<<<< HEAD
    private String name;
    private String animalType;
    private ArrayList<String> petList = new ArrayList<String>();
=======

    private String name;




    String name;
    String animalType;
>>>>>>> 81ca81d50ab389cd197ac61c5708902fee6b4eae

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
