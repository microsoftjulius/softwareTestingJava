package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    public void twoPlusTwoShouldEqualFour() {
        var calculatorObj = new SimpleCalculator();
        assertEquals(3, calculatorObj.add(2, 2));
    }
}