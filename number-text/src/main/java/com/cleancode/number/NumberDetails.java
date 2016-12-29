package com.cleancode.number;

public final class NumberDetails {

	private final int hundredDigit;
	private final int tenthDigit;
	private final int unit;

	public NumberDetails(int number) {
		this.hundredDigit = (number / 100) % 10;
		this.tenthDigit = (number / 10) % 10;
		this.unit = number % 10;
	}

	public int getTenthDigit() {
		return tenthDigit;
	}

	public int getUnit() {
		return unit;
	}

	public int getHundredDigit() {
		return hundredDigit;
	}

}
