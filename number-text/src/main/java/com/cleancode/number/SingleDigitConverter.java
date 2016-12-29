package com.cleancode.number;

import static java.util.Arrays.asList;
import java.util.List;

public class SingleDigitConverter implements Converter {
    
    private List<String> singleDigitText = asList("ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE");

    @Override
    public String convert(NumberDetails numberDetails) {
        return singleDigitText.get(numberDetails.getUnit());
    }
}