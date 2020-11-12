package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speakTest() {
        Dog toby = new Dog("Toby", "dog");
        String actual = toby.speak();
        String expected = "bark";

        assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        Dog toby = new Dog("Toby", "dog");
        boolean expected = true;
        boolean actual = toby instanceof Pet;
    }
}