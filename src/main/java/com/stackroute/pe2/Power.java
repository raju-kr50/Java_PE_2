package com.stackroute.pe2;

public class Power {

    public String powerChecker(String inputNumber) {
        try {
            int integerInput = Integer.parseInt(inputNumber);
        }
        catch (NumberFormatException nfe){
            return "Error:- Please enter number not string";
        }

        String result="";
        int integerInput = Integer.parseInt(inputNumber);
        if (integerInput < 0) {
            return "Error:- Please enter number greater than 4";
        }
        while (integerInput != 1) {
            if (integerInput % 4 == 0) {
                integerInput = integerInput / 4;
                result = "The entered number is power of 4";
            } else {
                result = "The entered number is not power of 4";
                break;
            }
        }

        return result;
    }

}
