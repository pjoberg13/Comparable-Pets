package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name, String animalType) {
        super(name, "cat");
    }
    @Override
    public String speak() {
        return "meow";
    }
}
