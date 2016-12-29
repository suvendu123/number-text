package com.cleancode.number;

public class NumberConverter {

    private SingleDigitData singleDigit;

    public NumberConverter() {
        this.singleDigit = new SingleDigitData();
    }

    public String convert(int number) {
        if(number == 20){
            return "TWENTY";
        }
        return number == 10 ? "TEN" : singleDigit.convert(number);

    }

}
