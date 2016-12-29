package com.cleancode.number;

public class NumberConverter {

  
    private NumberTextGenerator generator;

    public NumberConverter() {
        this.generator = new NumberTextGenerator();
    }
   
    public String convert(int number) {
    	NumberDetails details = new NumberDetails(number);
        return generator.generateText(details).trim();
    }

}
