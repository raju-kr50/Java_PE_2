package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {


    private Member member;
    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.member = new Member();
    }
    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.member = null;
    }

    @Test
    public void givenNameShouldReturnName() {
        String actualResult = member.details("Harry Potter");
        assertEquals("The name you entered is correct", actualResult);
    }

    @Test
    public void givenAgeShouldReturnAge() {
        String actualResult = member.details(30);
        assertEquals("The age you entered is correct", actualResult);
    }

    @Test
    public void givenSalaryShouldReturnSalary() {
        String actualResult = member.details(2500.3);
        assertEquals("The salary you entered is correct", actualResult);
    }
}