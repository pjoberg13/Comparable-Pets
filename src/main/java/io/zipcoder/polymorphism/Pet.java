package io.zipcoder.polymorphism;

import java.util.ArrayList;

public abstract class Pet implements Comparable<Pet> {

    private String name;
    private String animalType;
    private ArrayList<Pet> petList = new ArrayList<Pet>();

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

    public String speak(){
        return this.speak();
    }

    public int compareTo(Pet o){
        int nameDiff = name.compareToIgnoreCase(o.name);
            return nameDiff;

    }
}
