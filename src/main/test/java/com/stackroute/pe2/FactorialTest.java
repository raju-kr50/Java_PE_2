package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;

    @Before
    public void setUp() {
        this.factorial = new Factorial();
    }

    @After
    public void tearDown() {
        this.factorial = null;
    }

    @Test
    public void givenNumberShouldReturnFactorial() {
         actualResult = factorial.factorialChecker(12);
        assertEquals(479001600, actualResult);
    }

    @Test
    public void givenNumberShouldReturnErrorMessage() {
        String actualResult = factorial.factorialChecker(13);
        assertEquals("not a factorial", actualResult);
    }


}