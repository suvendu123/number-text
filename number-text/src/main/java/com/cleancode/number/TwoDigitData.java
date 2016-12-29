package com.cleancode.number;

import static java.util.Arrays.asList;
import java.util.List;

public class TwoDigitData {

    private List<String> tenthDigitText = asList("", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY",
            "EIGHTY", "NINETY");

    private List<String> twoDigitText = asList("", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN",
            "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");

    public String convert(int number) {
        int tenthPlace = (number / 10) % 10;
        if (tenthPlace == 1) {
            return twoDigitText.get(number % 10 + tenthPlace);
        }
        return tenthDigitText.get(tenthPlace);
    }
}