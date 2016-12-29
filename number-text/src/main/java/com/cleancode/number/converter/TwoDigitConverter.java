package com.cleancode.number.converter;

import static java.util.Arrays.asList;
import static com.cleancode.number.NumberConstant.EMPTY_TEXT;
import java.util.List;

import com.cleancode.number.NumberDetails;

public class TwoDigitConverter implements Converter {
    

    private List<String> tenthMultyText = asList(EMPTY_TEXT, EMPTY_TEXT, "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY",
            "EIGHTY", "NINETY");

    private List<String> tenthDigitText = asList(EMPTY_TEXT, "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN",
            "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");
    
    

    @Override
    public String convert(NumberDetails numberDetails) {
        return (numberDetails.getTenthDigit() == 1) ? tenthDigitText.get(numberDetails.getUnit() + 1)
                : tenthMultyText.get(numberDetails.getTenthDigit());

    }
}