//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class FactorialTest {
//
//
//    private Factorial factorial;
//    // Creates object before running Test cases
//    @Before
//    public void setUp() {
//        this.factorial = new Factorial();
//    }
//    // Destroys object created after running test cases
//    @After
//    public void tearDown() {
//        this.factorial = null;
//    }
//
//    @Test
//    public void givenNegativeNumberShouldReturnError() {
//        String actualResult = factorial.factorialCheckerForInvalidNumber(-8);
//        assertEquals("Error: Please enter a valid number", actualResult);
//    }
//
//    @Test
//    public void givenZeroShouldReturnFactorial() {
//        int actualResult = factorial.factorialCheckerForInt(0);
//        assertEquals(1, actualResult);
//    }
//
//    @Test
//    public void givenNumberShouldReturnFactorial() {
//        int actualResult = factorial.factorialCheckerForInt(12);
//        assertEquals(479001600, actualResult);
//    }
//
//    @Test
//    public void givenNumberShouldReturnErrorMessage() {
//        long actualResult = factorial.factorialCheckerForLong(13);
//        assertEquals("6227020800", actualResult);
//    }
//
//    @Test
//    public void givenNumberShouldReturnErrorMessage() {
//        long actualResult = factorial.factorialCheckerForLong(20);
//        assertEquals("2432902008176640000", actualResult);
//    }
//
//    @Test
//    public void givenStringShouldReturnFactorial() {
//        String  actualResult = factorial.factorialCheckerForString("Hello");
//        assertEquals("Error: Please enter a valid number", actualResult);
//    }
//
//
//
//}