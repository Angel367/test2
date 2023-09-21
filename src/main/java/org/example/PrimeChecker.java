package org.example;

public class PrimeChecker{
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