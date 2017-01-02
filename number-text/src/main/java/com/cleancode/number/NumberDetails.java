package com.cleancode.number;

public final class NumberDetails {

	private final int number;
	
	public NumberDetails(int number) {
		this.number = number;
	}
	
	public int getTenthDigit() {
		return (number / 10) % 10;
	}

	public int getUnit() {
		return number % 10;
	}

	public int getHundredDigit() {
		return (number / 100) % 10;
	}
	public int getThousandDigit() {
		return  number / 1000;
	}

}
