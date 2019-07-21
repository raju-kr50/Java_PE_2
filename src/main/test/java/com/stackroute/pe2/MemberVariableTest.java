package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable member;

    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.member = new MemberVariable("Harry Potter", 30, 2500.3);
    }

    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.member = null;
    }

    @Test
    public void givenDetailsShouldReturnCorrectMessage() {
        String actualResult = member.details("Harry Potter",30,2500.3);
        assertEquals("The details you entered is correct", actualResult);
    }

    @Test
    public void givenDetailsShouldReturnIncorrectMessage() {
        String actualResult = member.details("Harry Ptter",37,2500.3);
        assertEquals("The details you entered is incorrect", actualResult);
    }

}