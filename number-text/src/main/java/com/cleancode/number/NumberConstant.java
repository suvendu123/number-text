package com.cleancode.number;

import static java.util.Arrays.asList;

import java.util.List;

public class NumberConstant {
    public static final String EMPTY_TEXT = "";
    public static final String HUNDRED = " HUNDRED";
    public static final String THOUSAND = " THOUSAND";
    public static final String FINAL_FORMAT = "%s %s %s %s";

    public static final List<String> SINGLE_DIGIT_TEXT = asList(EMPTY_TEXT, "ONE", "TWO", "THREE", "FOUR", "FIVE",
            "SIX", "SEVEN", "EIGHT", "NINE");

    public static final List<String> TENTH_MULTY_TEXT = asList(EMPTY_TEXT, EMPTY_TEXT, "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY",
            "SEVENTY", "EIGHTY", "NINETY");

    public static final List<String> TENTH_DIGIT_TEXT = asList(EMPTY_TEXT, "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
            "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");

}
