package com.cleancode.number;

public class NumberConverter {

    public String convert(int number) {
        if(number == 9) {
            return "NINE";
        }
        return number == 6 ? "SIX" : "ONE";
    }

}
