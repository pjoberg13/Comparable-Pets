package io.zipcoder.polymorphism;


public class Bird extends Pet{

    public Bird(String name, String animalType) {
        super(name, "bird");
    }

    public String speak() {
        return "squak";
    }
}
