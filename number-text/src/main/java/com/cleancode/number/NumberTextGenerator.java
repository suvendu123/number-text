package com.cleancode.number;

public class NumberTextGenerator {

	private SingleDigitConverter singleDigit;
	private TwoDigitConverter twoDigit;

	public NumberTextGenerator() {
		this.singleDigit = new SingleDigitConverter();
		this.twoDigit = new TwoDigitConverter();
	}

	public String generateText(NumberDetails details) {
		return String.format("%s %s", twoDigit.convert(details), singleDigit.convert(details));
	}

}
