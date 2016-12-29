package com.cleancode.number;

public class NumberConverter {

    private String[] singleDigitText = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };

    public String convert(int number) {
        return singleDigitText[number];
    }

}
