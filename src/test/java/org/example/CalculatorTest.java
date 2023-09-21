package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5.0, calculator.addition(2.0, 3.0));
    }

    @Test
    void testSubtraction() {
        assertEquals(2.0, calculator.subtraction(5.0, 3.0));
    }

    @Test
    void testMultiply() {
        assertEquals(10.0, calculator.multiply(2.0, 5.0));
    }

    @Test
    void testDivision() {
        try {
            assertEquals(2.0, calculator.division(6.0, 3.0));
        } catch (Exception e) {
            fail("Division threw an exception");
        }
    }

    @Test
    void testDivisionByZero() {
        assertThrows(Exception.class, () -> calculator.division(6.0, 0.0));
    }
}
