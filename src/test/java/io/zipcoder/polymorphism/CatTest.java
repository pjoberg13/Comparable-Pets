package io.zipcoder.polymorphism;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void speakTest() {
        Cat snaps = new Cat("Snaps", "cat");
        String actual = snaps.speak();
        String expected = "meow";

        assertEquals(expected, actual);
    }
}