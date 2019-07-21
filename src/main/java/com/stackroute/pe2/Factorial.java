package com.stackroute.pe2;

public class Factorial {
    public String factorialChecker(int number) {
        int factorial = 1;
        String result;
        if (number < 0) {
            result = "Error: Please enter a valid number";
        } else if (number > 12) {
            result = "Error: The factorial of 13 is out of range";
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            result = String.valueOf(factorial);
        }
        return result;
    }

    public String factorialCheckerForLong(int number) {
        long factorial = 1;
        String result;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        result = String.valueOf(factorial);
        return result;
    }
}
