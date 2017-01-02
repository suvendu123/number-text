package com.cleancode.number.converter;

import com.cleancode.number.NumberDetails;
import static com.cleancode.number.NumberConstant.SINGLE_DIGIT_TEXT;
import static com.cleancode.number.NumberConstant.EMPTY_TEXT;
import static com.cleancode.number.NumberConstant.THOUSAND;

public class FourDigitConverter implements Converter {

    
	@Override
	public String convert(NumberDetails details) {
		return details.getThousandDigit() != 0 ? SINGLE_DIGIT_TEXT.get(details.getThousandDigit()) + THOUSAND : EMPTY_TEXT;
	}

}
