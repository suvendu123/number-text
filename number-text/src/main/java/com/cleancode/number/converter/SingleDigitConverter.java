package com.cleancode.number.converter;

import static com.cleancode.number.NumberConstant.EMPTY_TEXT;
import static com.cleancode.number.NumberConstant.SINGLE_DIGIT_TEXT;

import com.cleancode.number.NumberDetails;

public class SingleDigitConverter implements Converter {

	
	@Override
	public String convert(NumberDetails details) {
		return details.getTenthDigit() != 1 ? SINGLE_DIGIT_TEXT.get(details.getUnit()) : EMPTY_TEXT;

	}
	
}