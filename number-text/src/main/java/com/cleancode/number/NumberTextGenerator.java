package com.cleancode.number;

import static com.cleancode.number.NumberConstant.FINAL_FORMAT;
import com.cleancode.number.converter.HundredConverter;
import com.cleancode.number.converter.SingleDigitConverter;
import com.cleancode.number.converter.ThousandConverter;
import com.cleancode.number.converter.TwoDigitConverter;

public class NumberTextGenerator {

	private SingleDigitConverter singleDigit;
	private TwoDigitConverter twoDigit;
	private HundredConverter hundredConverter;
	private ThousandConverter thousandConverter;

	public NumberTextGenerator() {
		this.singleDigit = new SingleDigitConverter();
		this.twoDigit = new TwoDigitConverter();
		this.hundredConverter = new HundredConverter();
		this.thousandConverter = new ThousandConverter();
	}

	public String generateText(NumberDetails details) {
		return String.format(FINAL_FORMAT, thousandConverter.convert(details), hundredConverter.convert(details),
				twoDigit.convert(details), singleDigit.convert(details));
	}
	
	
}
