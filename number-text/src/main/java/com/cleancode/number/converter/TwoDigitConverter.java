package com.cleancode.number.converter;

import static com.cleancode.number.NumberConstant.TENTH_DIGIT_TEXT;
import static com.cleancode.number.NumberConstant.TENTH_MULTY_TEXT;

import com.cleancode.number.NumberDetails;

public class TwoDigitConverter implements Converter {
    

    @Override
    public String convert(NumberDetails numberDetails) {
        return (numberDetails.getTenthDigit() == 1) ? TENTH_DIGIT_TEXT.get(numberDetails.getUnit() + 1)
                : TENTH_MULTY_TEXT.get(numberDetails.getTenthDigit());

    }
}