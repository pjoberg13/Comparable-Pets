package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void speak() {
        Bird polly = new Bird("polly", "bird");
        String expected = "squak";
        String actual = polly.speak();

        assertEquals(expected, actual);
    }

    @Test
    public void constructorTest() {
        Bird polly = new Bird("polly", "bird");
        boolean expected = true;
        boolean actual = polly instanceof Pet;

        assertEquals(expected, actual);
    }
}