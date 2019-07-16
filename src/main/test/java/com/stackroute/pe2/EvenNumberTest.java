package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {

    private EvenNumberTest evenNumberTest;


    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.evenNumberTest = new EvenNumberTest();
    }
    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.evenNumberTest = null;
    }


    @Test
    public void givenNullShouldReturnErrorMessage() {
        String actualResult = evenNumberTest.isEven(null);
        assertEquals("Error: Please enter a number", actualResult);
    }

    @Test
    public void givenEvenNumberShouldReturnEven() {
        String actualResult = evenNumberTest.isEven(78);
        assertEquals("It is an even number", actualResult);
    }

    @Test
    public void givenOddNumberShouldReturnOdd() {
        String actualResult = evenNumberTest.isEven(59);
        assertEquals("It is an odd number", actualResult);
    }
}
