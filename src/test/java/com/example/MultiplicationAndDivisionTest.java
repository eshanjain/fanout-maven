package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationAndDivisionTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(-12, calculator.multiply(-4, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
        assertEquals(-2.0, calculator.divide(-6, 3), 0.0001);
        assertEquals(0.5, calculator.divide(1, 2), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(5, 0);
    }
}
