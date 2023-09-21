package org.example;

/**
 * The Calculator class provides methods for performing mathematical operations.
 */
public class Calculator {

    /**
     * Performs addition of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of addition.
     */
    double addition(double a, double b){
        return a + b;
    }

    /**
     * Performs subtraction of one number from another.
     *
     * @param a The minuend.
     * @param b The subtrahend.
     * @return The result of subtraction.
     */
    double subtraction(double a, double b){
        return a - b;
    }

    /**
     * Performs multiplication of two numbers.
     *
     * @param a The first factor.
     * @param b The second factor.
     * @return The result of multiplication.
     */
    double multiply(double a, double b){
        return a * b;
    }

    /**
     * Performs division of one number by another.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of division.
     * @throws Exception If the divisor is zero.
     */
    double division(double a, double b) throws Exception {
        if (b != 0)
            return a / b;
        else
            throw new Exception("div by zero");
    }
}
