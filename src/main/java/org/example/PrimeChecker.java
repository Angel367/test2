package org.example;

/**
 * The PrimeChecker class provides a method for checking if a given number is prime.
 */
public class PrimeChecker{

    /**
     * Checks if the given number is prime.
     *
     * @param a The number to be checked.
     * @return true if the number is prime, false otherwise.
     * @throws Exception If the given number is less than 0.
     */
    boolean isPrime(int a) throws Exception {
        if (a < 0)
            throw new Exception("given argument < 0");
        if (a == 2)
            return true;
        else if (a < 2)
            return false;
        else
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
        return true;
    }
}
