package com.stackroute.pe2;

public class StudentGrade {

    public String gradeCalculator(int numberOfStudents, int[] grades) {
        String result;
        int minimum = 0;
        int maximum = 0;
        double average = 0;
        int sum = 0;
        if (numberOfStudents < 1) {
            return "Please enter valid number of students";
        } else {
            for (int i = 0; i < numberOfStudents; i++) {
                sum = sum + grades[i];
                for (int j = i + 1; j < numberOfStudents; j++) {
                    if (grades[i] >= grades[j]) {
                        int temp = grades[i];
                        grades[i] = grades[j];
                        grades[j] = temp;
                    }
                }
                average = sum / numberOfStudents;
                maximum = grades[0];
                minimum = grades[numberOfStudents - 1];
            }

        }
        result = "Average: " + average + "  Minimum: " + minimum + "  Maximum: " + maximum;
        return result;
    }
}
