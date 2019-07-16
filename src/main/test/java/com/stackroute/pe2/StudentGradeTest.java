package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade studentGrade;

    @Before
    public void setUp() {
        this.studentGrade = new StudentGrade();
    }

    @After
    public void tearDown() {
        this.studentGrade = null;
    }

    @Test
    public void givenNoOfStudentAsNullShouldReturnErrorMessage() {
        String actualResult = studentGrade.gradeCalculator(4, 4);

    }
}