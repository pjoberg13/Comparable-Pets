package io.zipcoder.polymorphism;



public class Dog extends Pet{

    public Dog(String name){

    }
    public Dog(String name, String animalType) {
        super(name, animalType);
    }


    public String speak() {
        return "bark";
    }


}
