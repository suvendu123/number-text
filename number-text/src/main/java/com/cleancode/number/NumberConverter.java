package com.cleancode.number;

import static java.util.Arrays.asList;
import java.util.List;

public class NumberConverter {

    private List<String> singleDigitText = asList("ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN",
            "EIGHT", "NINE");

    public String convert(int number) {
        if(number == 10){
            return "TEN";
        }
        return singleDigitText.get(number++);
    }

}
