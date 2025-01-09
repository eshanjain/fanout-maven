package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubtractionTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-7, calculator.subtract(-4, 3));
        assertEquals(0, calculator.subtract(0, 0));
    }
}
