package org.example;

import java.util.ArrayList;

/**
 * The Quadratic class provides a method for calculating the roots of a quadratic equation.
 */
public class Quadratic {

    /**
     * Calculates the roots of a quadratic equation of the form ax^2 + bx + c = 0.
     *
     * @param a The coefficient of x^2.
     * @param b The coefficient of x.
     * @param c The constant term.
     * @return A list of roots of the equation.
     */
    public ArrayList<Double> calculate(double a, double b, double c) {
        double D = (b * b - 4 * a * c);
        ArrayList<Double> arr = new ArrayList<>();
        if (D > 0) {
            arr.add((-b + Math.sqrt(D)) / (2 * a)); // First root
            arr.add((-b - Math.sqrt(D)) / (2 * a)); // Second root
        }
        if (D == 0){
            arr.add(-b / (2 * a)); // Single root
        }
        return arr;
    }
}
