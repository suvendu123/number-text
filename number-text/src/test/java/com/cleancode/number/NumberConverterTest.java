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
    
    @Test
    public void should_return_twenty() {
        assertEquals("TWENTY", converter.convert(20));
    }
    
    @Test
    public void should_return_nineteen() {
        assertEquals("NINETEEN", converter.convert(19));
    }
    
    @Test
    public void should_return_ninety_five() {
        assertEquals("NINETY FIVE", converter.convert(95));
    }
    
    @Test
    public void should_return_above_Hundred_below_thousand() {
        assertEquals("TWO HUNDRED NINETY FIVE", converter.convert(295));
        assertEquals("SIX HUNDRED SIXTY SIX", converter.convert(666));
    }
    
    @Test
    public void should_return_above_thousand_and_above() {
        assertEquals("ONE THOUSAND TWO HUNDRED NINETY FIVE", converter.convert(1295));
        assertEquals("SIX THOUSAND SIX HUNDRED SIXTY SIX", converter.convert(6666));
    }
 
}
