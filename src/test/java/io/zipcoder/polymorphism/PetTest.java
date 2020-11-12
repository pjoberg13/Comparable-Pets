package io.zipcoder.polymorphism;

import org.junit.Test;

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
}