package io.zipcoder.polymorphism;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getName() {
        Dog toby = new Dog("Toby", "dog");
        String expected = "Toby";
        String actual = toby.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void setName() {
        Dog toby = new Dog("Toby", "dog");
        toby.setName("Samson");

        String expected = "Samson";
        String actual = toby.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void compareToTest(){
        Bird crackers = new Bird("crackers","bird");
        Bird polly = new Bird("polly","bird");
        ArrayList<Pet> actual = new ArrayList<Pet>();
        actual.add(polly);
        actual.add(crackers);
        Collections.sort(actual);
        Pet [] birds = {crackers,polly};
        ArrayList<Pet> expected = new ArrayList<Pet>(Arrays.asList(birds));

        assertTrue(String.valueOf(expected.containsAll(actual)),actual.containsAll(expected));

    }
}