package com.cleancode.number;

public class HundredConverter implements Converter {

	private SingleDigitConverter singleConverter;

	public HundredConverter() {
		this.singleConverter = new SingleDigitConverter();
	}

	@Override
	public String convert(NumberDetails numberDetails) {
		return numberDetails.getHundredDigit() != 0
				? singleConverter.getSingleDigitText().get(numberDetails.getHundredDigit()) + " HUNDRED" : "";
	}

}
