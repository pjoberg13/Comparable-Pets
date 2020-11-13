package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name, String animalType) {
        super(name, "cat");
    }
    @Override
    public String speak() {
        return "meow";
    }

    public int compareTo(Pet o) {
        return 0;
    }
    public int compareTo(Pet a,Pet b) {
        return a.getName().compareTo(b.getName());
    }
    @Override
    public String toString(){
        return "cat";
    }
}
