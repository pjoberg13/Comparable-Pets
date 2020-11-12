package io.zipcoder.polymorphism;


public class Bird extends Pet{

    public Bird(String name, String animalType) {
        super(name, animalType);
    }


    public String speak() {
        return "squak";
    }


}
