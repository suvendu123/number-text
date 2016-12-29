package com.cleancode.number;

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
