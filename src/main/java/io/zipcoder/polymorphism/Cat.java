package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name, String animalType) {
        super(name, "cat");
    }

    public String speak() {
        return "meow";
    }
}
