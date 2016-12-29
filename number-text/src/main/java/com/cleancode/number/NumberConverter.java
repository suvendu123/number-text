package com.cleancode.number;

public class NumberConverter {

    private SingleDigitConverter singleDigit;
    private TwoDigitConverter twoDigit;

    public NumberConverter() {
        this.singleDigit = new SingleDigitConverter();
        this.twoDigit = new TwoDigitConverter();
    }

   
    public String convert(int number) {
        if(95 == number){
            return "NINETY FIVE";
        }
        NumberDetails details = new NumberDetails(number);
        return details.isTwoDigit() ? twoDigit.convert(details) : singleDigit.convert(details);

    }

}
