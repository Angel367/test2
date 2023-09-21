package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    @Test
    void testIsEvenWithEvenNumber() {
        EvenChecker evenChecker = new EvenChecker();
        assertTrue(evenChecker.is_even(6));
    }

    @Test
    void testIsEvenWithOddNumber() {
        EvenChecker evenChecker = new EvenChecker();
        assertFalse(evenChecker.is_even(7));
    }

    @Test
    void testIsEvenWithZero() {
        EvenChecker evenChecker = new EvenChecker();
        assertTrue(evenChecker.is_even(0));
    }
}
