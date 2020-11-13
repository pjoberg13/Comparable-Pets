package io.zipcoder.polymorphism;



public class Dog extends Pet{

    public Dog(String name, String animalType) {
        super(name, "dog");
    }
    @Override
    public String speak() {
        return "bark";
    }

    public int compareTo(Pet a,Pet b) {
        return a.getName().compareTo(b.getName());
    }


    @Override
    public String toString(){
        return "dog";
    }
}
