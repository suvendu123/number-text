package com.cleancode.number;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberConverterTest {
    
    @Test
    public void should_return_one(){
        NumberConverter converter = new NumberConverter();
        assertEquals("ONE", converter.convert(1));
    }
 
}