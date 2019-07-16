package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    private EvenNumTest evenNumTest;


    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.evenNumTest = new EvenNumTest();
    }
    // Destroys object created after running test cases
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
    public void givenEvenNumberShouldReturnEven() {
        String actualResult = evenNumTest.isEven(78);
        assertEquals("It is an even number", actualResult);
    }

    @Test
    public void givenOddNumberShouldReturnOdd() {
        String actualResult = evenNumTest.isEven(59);
        assertEquals("It is an odd number", actualResult);
    }
}