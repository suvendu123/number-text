package com.cleancode.number.converter;

import static com.cleancode.number.NumberConstant.EMPTY_TEXT;
import com.cleancode.number.NumberDetails;

public interface Converter {

    String convert(NumberDetails numberDetails);
   
}