package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() {
        this.palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        this.palindrome = null;
    }

    @Test
    public void givenPalindromeNumberShouldReturnItsPalindrome() {
        int actualResult = palindrome.checkPalindrome(3456543);
        assertEquals("The given number is Palindrome", actualResult);
    }

    @Test
    public void givenNonPalindromeNumberShouldReturnNotPalindrome() {
        int actualResult = palindrome.checkPalindrome(6342554);
        assertEquals("The given number is not Palindrome",actualResult);
    }

    @Test
    public void givenPalindromeStringShouldReturnItsPalindrome() {
        String actualResult = palindrome.checkPalindrome("wertytrew");
        assertEquals("The given string is Palindrome",actualResult);
    }

    @Test
    public void givenNonPalindromeStringShouldReturnNotPalindrome() {
        String actualResult = palindrome.checkPalindrome("djwdwyb");
        assertEquals("The given string is not Palindrome",actualResult);
    }

    @Test
    public void givenNegativeNumberShouldReturnErrorMessage() {
        int actualResult = palindrome.checkPalindrome(-2627126);
        assertEquals("Error: Please enter valid number or string",actualResult);
    }

    @Test
    public void givenNumberLessThanHundredShouldReturnTryAgain() {
        int actualResult = palindrome.checkPalindrome(44);
        assertEquals("Try again with number greater than 100",actualResult);
    }

    @Test
    public void givenNullShouldReturnErrorMessage() {
        String actualResult = palindrome.checkPalindrome(null);
        assertNull("Error: Please enter valid number or string", actualResult);
    }
}