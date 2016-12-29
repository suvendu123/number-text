package com.cleancode.number;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberConverterTest {

    private NumberConverter converter;

    @Before
    public void setUp() {
        converter = new NumberConverter();
    }

    @Test
    public void should_return_one() {
        assertEquals("ONE", converter.convert(1));
    }

    @Test
    public void should_return_six() {
        assertEquals("SIX", converter.convert(6));
    }
    
    @Test
    public void should_return_nine() {
        assertEquals("NINE", converter.convert(9));
    }
    
    @Test
    public void should_return_ten() {
        assertEquals("TEN", converter.convert(10));
    }
    
   
 
}
