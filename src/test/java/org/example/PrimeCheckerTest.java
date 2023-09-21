package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    void testIsPrimeWithPrimeNumber() throws Exception {
        PrimeChecker primeChecker = new PrimeChecker();
        assertTrue(primeChecker.isPrime(17));
    }

    @Test
    void testIsPrimeWithNonPrimeNumber() throws Exception {
        PrimeChecker primeChecker = new PrimeChecker();
        assertFalse(primeChecker.isPrime(10));
    }

    @Test
    void testIsPrimeWithZero() throws Exception {
        PrimeChecker primeChecker = new PrimeChecker();
        assertFalse(primeChecker.isPrime(0));
    }

    @Test
    void testIsPrimeWithNegativeNumber() {
        PrimeChecker primeChecker = new PrimeChecker();
        assertThrows(Exception.class, () -> primeChecker.isPrime(-5));
    }
}
