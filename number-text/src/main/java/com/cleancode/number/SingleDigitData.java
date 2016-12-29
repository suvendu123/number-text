package com.cleancode.number;

import static java.util.Arrays.asList;
import java.util.List;

public class SingleDigitData {
    
    public List<String> singleDigitText = asList("ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE");

    public String convert(int number) {
        return singleDigitText.get(number++);
    }
}