package com.cleancode.number.converter;

import static java.util.Arrays.asList;
import java.util.List;

import com.cleancode.number.NumberDetails;

public class TwoDigitConverter implements Converter {
    

    private List<String> tenthMultyText = asList("", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY",
            "EIGHTY", "NINETY");

    private List<String> tenthDigitText = asList("", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN",
            "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");
    
    

    @Override
    public String convert(NumberDetails numberDetails) {
        return (numberDetails.getTenthDigit() == 1) ? tenthDigitText.get(numberDetails.getUnit() + 1)
                : tenthMultyText.get(numberDetails.getTenthDigit());

    }
}