package org.example;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void initialize() {
        calculator = new Calculator();
    }

    @Test
    public void addFunctionShouldReturnZeroForEmptyString() {

        assertEquals(0, calculator.add(""));
    }

    @Test
    public void addFunctionShouldReturnZeroForSingleNumberString() {
        assertEquals(4, calculator.add("4"));
    }

    @Test
    public void addFunctionShouldReturnSumForTwoNumbersDelimitedByComma() {
        assertEquals(5, calculator.add("3,2"));
    }

    @Test
    public void addFunctionShouldReturnSumForMultipleNumbersDelimitedByNewLineCharacter() {
        assertEquals(6, calculator.add("2,2,2\n\n"));
    }
    @Test
    public void addFunctionShouldReturnSumForCustomDelimiter(){
        assertEquals(10,calculator.add("//;\n1;2;3;4"));
    }
    @Test
    public void testNegativeNumberThrowsExceptionForSingleNumber() {
        Calculator calc = new Calculator();

        try {
            calc.add("1,-2,3");
            fail("Expected IllegalArgumentException for negative numbers");
        } catch (IllegalArgumentException ex) {
            assertEquals("negative numbers not allowed -2", ex.getMessage());
        }
    }
    @Test
    public void testNegativeNumberThrowsExceptionForMultipleNumbers() {
        Calculator calc = new Calculator();

        try {
            calc.add("1,-2,-3,3");
            fail("Expected IllegalArgumentException for negative numbers");
        } catch (IllegalArgumentException ex) {
            assertEquals("negative numbers not allowed -2, -3", ex.getMessage());
        }
    }
}
