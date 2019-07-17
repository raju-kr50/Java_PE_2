package com.stackroute.pe2;

public class EvenNumber {

    public String isEven(int number){
        String result;
        if (number % 2 == 0) {
            result = "It is an even number";
        } else {
            result = "It is an odd number";
        }

        return result;

    }

    public String isEvenString(String str) {
        String result;
        result = "Error: Please enter a number";
        return result;
    }
}
