package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {


    public int compare(Pet o1, Pet o2) {
       return o1.toString().compareTo(o2.toString());
    }
}
