package com.cleancode.number;

import static java.util.Arrays.asList;
import java.util.List;

public class SingleDigitConverter implements Converter {

	private List<String> singleDigitText = asList("", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE");

	@Override
	public String convert(NumberDetails numberDetails) {
		return numberDetails.getTenthDigit() != 1 ? singleDigitText.get(numberDetails.getUnit()) : "";

	}

	public List<String> getSingleDigitText() {
		return singleDigitText;
	}
}