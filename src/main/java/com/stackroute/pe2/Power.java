package com.stackroute.pe2;

public class Power {


    public String powerChecker(int n)
    {
        if(n == 0)
            return 0;
        while(n != 1)
        {
            if(n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;


}
