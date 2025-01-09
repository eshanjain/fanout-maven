package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-4, 3));
        assertEquals(0, calculator.add(0, 0));
    }
}

 
