package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest evenNumTest;

    @Before
    public void setUp() {
        this.evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown() {
        this.evenNumTest = null;
    }

    @Test
    public void givenNullShouldReturnErrorMessage() {
        String actualResult = evenNumTest.isEven(null);
        assertEquals("Error: Please enter a number", actualResult);
    }

    @Test
    public void givenEvenNumberShouldReturnTrue() {
        String actualResult = evenNumTest.isEven(78);
        assertEquals("True", actualResult);
    }

    @Test
    public void givenOddNumberShouldReturnFalse() {
        String actualResult = evenNumTest.isEven(59);
        assertEquals("False", actualResult);
    }
}