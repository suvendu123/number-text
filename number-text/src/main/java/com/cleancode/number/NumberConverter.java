package com.cleancode.number;

import static com.cleancode.number.NumberConstant.FINAL_FORMAT;

import com.cleancode.number.converter.ThreeDigitConverter;
import com.cleancode.number.converter.SingleDigitConverter;
import com.cleancode.number.converter.FourDigitConverter;
import com.cleancode.number.converter.TwoDigitConverter;

public class NumberConverter{
  
    private SingleDigitConverter singleDigit;
    private TwoDigitConverter twoDigit;
    private ThreeDigitConverter hundredConverter;
    private FourDigitConverter thousandConverter;

    public NumberConverter() {
        this.singleDigit = new SingleDigitConverter();
        this.twoDigit = new TwoDigitConverter();
        this.hundredConverter = new ThreeDigitConverter();
        this.thousandConverter = new FourDigitConverter();
    }
   

    public String convert(int number) {
    	NumberDetails details = new NumberDetails(number);
        return convert(details).trim();
    }

    public String convert(NumberDetails details) {
        return String.format(FINAL_FORMAT, thousandConverter.convert(details), hundredConverter.convert(details),
                twoDigit.convert(details), singleDigit.convert(details));
    }

}
