package com.cleancode.number;

import com.cleancode.number.converter.HundredConverter;
import com.cleancode.number.converter.SingleDigitConverter;
import com.cleancode.number.converter.TwoDigitConverter;

public class NumberTextGenerator {

	private SingleDigitConverter singleDigit;
	private TwoDigitConverter twoDigit;
	private HundredConverter hundredConverter;

	public NumberTextGenerator() {
		this.singleDigit = new SingleDigitConverter();
		this.twoDigit = new TwoDigitConverter();
		this.hundredConverter = new HundredConverter();
	}

	public String generateText(NumberDetails details) {
		return String.format("%s %s %s",hundredConverter.convert(details), twoDigit.convert(details), singleDigit.convert(details));
	}

}
