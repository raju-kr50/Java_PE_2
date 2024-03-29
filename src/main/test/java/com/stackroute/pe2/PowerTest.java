package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {


    private Power power;

    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.power = new Power();
    }

    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.power = null;
    }

    @Test
    public void givenPowerOfFourShouldReturnPowerOfFour() {
        String actualResult = power.powerChecker("64");
        assertEquals("The entered number is power of 4", actualResult);
    }

    @Test
    public void givenNotPowerOfFourShouldReturnNotPowerOfFour() {
        String actualResult = power.powerChecker("80");
        assertEquals("The entered number is not power of 4", actualResult);
    }

    @Test
    public void givenNumberLessThanFourShouldReturnErrorMessage() {
        String actualResult = power.powerChecker("-5");
        assertEquals("Error:- Please enter number greater than 4", actualResult);
    }

    @Test
    public void givenStringShouldReturnErrorMessage() {
        String actualResult = power.powerChecker("String");
        assertEquals("Error:- Please enter number not string", actualResult);
    }

}