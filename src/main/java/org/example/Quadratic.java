package org.example;

import java.util.ArrayList;

public class Quadratic {
    public ArrayList<Double> calculate(double a, double b, double c) {
        double D = (b * b - 4 * a * c);
        ArrayList<Double> arr = new ArrayList<>();
        if (D > 0) {
            arr.add((-b + Math.sqrt(D)) / 2 * a);
            arr.add((-b - Math.sqrt(D)) / 2 * a);
        }
        if (D == 0){
            arr.add(-b / 2 * a);
        }
        return arr;
    }
}
