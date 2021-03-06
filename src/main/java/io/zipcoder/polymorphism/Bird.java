package io.zipcoder.polymorphism;


public class Bird extends Pet{

    public Bird(String name, String animalType) {
        super(name, "bird");
    }
    @Override
    public String speak() {
        return "squak";
    }

    public int compareTo(Pet a,Pet b) {
        return a.getName().compareTo(b.getName());
    }



    @Override
    public String toString(){
        return "bird";
    }
}
