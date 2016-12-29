package com.cleancode.number;

import static java.util.Arrays.asList;
import java.util.List;

public class TwoDigitData {
    
    public List<String> twoDigitText =  asList( "" , "TEN", "TWENTY");

    public String convert(int number) {
         return twoDigitText.get((number/10)%10);
    }
}