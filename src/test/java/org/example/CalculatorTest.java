package org.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void initialize() {
        calculator=new Calculator();
    }

    @Test
    public void addFunctionShouldReturnZeroForEmptyString() {

        assertEquals(0,calculator.add(""));
    }
    @Test
    public void addFunctionShouldReturnOneforSingleNumberString(){
        assertEquals(1,calculator.add("1"));
    }
}