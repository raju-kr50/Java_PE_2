package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {


    private Factorial factorial;
    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.factorial = new Factorial();
    }
    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.factorial = null;
    }

    @Test
    public void givenNegativeNumberShouldReturnError() {
        String actualResult = factorial.factorialChecker(-8);
        assertEquals("Error: Please enter a valid number", actualResult);
    }

    @Test
    public void givenZeroShouldReturnFactorial() {
        String actualResult = factorial.factorialChecker(0);
        assertEquals("1", actualResult);
    }

    @Test
    public void givenNumberShouldReturnFactorial() {
        String actualResult = factorial.factorialChecker(12);
        assertEquals("479001600", actualResult);
    }

    @Test
    public void givenNumberShouldReturnErrorMessage() {
        String actualResult = factorial.factorialChecker(13);
        assertEquals("Error: The factorial of 13 is out of range", actualResult);
    }

    @Test
    public void givenNumberShouldReturnLongValue() {
        String actualResult = factorial.factorialCheckerForLong(13);
        assertEquals("6227020800", actualResult);
    }

    @Test
    public void givenNumberShouldReturnLonfFactorial() {
        String actualResult = factorial.factorialCheckerForLong(20);
        assertEquals("2432902008176640000", actualResult);
    }

}