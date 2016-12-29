package com.cleancode.number;

public class NumberConverter {

    private SingleDigitData singleDigit;
    private TwoDigitData twoDigit;

    public NumberConverter() {
        this.singleDigit = new SingleDigitData();
        this.twoDigit = new TwoDigitData();
    }

    public String convert(int number) {
        return (number / 10) % 10 != 0 ? twoDigit.convert(number) : singleDigit.convert(number);

    }

}
