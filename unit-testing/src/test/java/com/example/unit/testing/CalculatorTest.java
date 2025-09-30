package com.example.unit.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));   // 2 + 3 = 5
        assertEquals(0, calc.add(-2, 2));  // -2 + 2 = 0
    }

    @Test
    void subtract() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.subtract(10, 4));  // 10 - 4 = 6
        assertEquals(-5, calc.subtract(5, 10)); // 5 - 10 = -5
    }
}
