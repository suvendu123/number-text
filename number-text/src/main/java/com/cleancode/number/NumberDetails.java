package com.cleancode.number;

public final class NumberDetails {

    private final int tenthDigit;
    private final int unit;

    public NumberDetails(int number) {
        this.tenthDigit = (number / 10) % 10;
        this.unit = number % 10;
    }

    public int getTenthDigit() {
        return tenthDigit;
    }

    public int getUnit() {
        return unit;
    }

    public boolean isTwoDigit() {
        return tenthDigit != 0;
    }

}
