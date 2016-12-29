package com.cleancode.number.converter;

import com.cleancode.number.NumberDetails;
import static com.cleancode.number.NumberConstant.SINGLE_DIGIT_TEXT;
import static com.cleancode.number.NumberConstant.EMPTY_TEXT;
import static com.cleancode.number.NumberConstant.HUNDRED;

public class HundredConverter implements Converter {
	
	@Override
	public String convert(NumberDetails details) {
		return details.getHundredDigit() != 0 ? SINGLE_DIGIT_TEXT.get(details.getHundredDigit()) + HUNDRED : EMPTY_TEXT;
	}

}
