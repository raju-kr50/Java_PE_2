package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {


    private StudentGrade studentGrade;

    // Creates object before running Test cases
    @Before
    public void setUp() {
        this.studentGrade = new StudentGrade();
    }

    // Destroys object created after running test cases
    @After
    public void tearDown() {
        this.studentGrade = null;
    }

    @Test
    public void givenNoOfStudentAsNullShouldReturnErrorMessage() {
        int[] grades = {90, 90, 90, 90, 90};
        String actualResult = studentGrade.gradeCalculator(-8, grades);
        assertEquals("Please enter valid number of students", actualResult);
    }

    @Test
    public void givenNoOfStudentAndGradesShouldReturnTheResult() {
        int[] grades = {90, 90, 90, 90, 90};
        String actualResult = studentGrade.gradeCalculator(5, grades);
        assertEquals("Average: " + 90.0 + "  Minimum: " + 90 + "  Maximum: " + 90, actualResult);
    }
}