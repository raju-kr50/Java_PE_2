package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {

    private EvenNumber evenNumber;

    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.evenNumber = new EvenNumber();
    }

    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.evenNumber = null;
    }

    @Test
    public void givenEvenNumberShouldReturnEven() {
        String actualResult = evenNumber.isEven(78);
        assertEquals("It is an even number", actualResult);
    }

    @Test
    public void givenOddNumberShouldReturnOdd() {
        String actualResult = evenNumber.isEven(59);
        assertEquals("It is an odd number", actualResult);
    }

    @Test
    public void givenNullShouldReturnErrorMessage() {
        String actualResult = evenNumber.isEvenString(null);
        assertEquals("Error: Please enter a number", actualResult);
    }
}
