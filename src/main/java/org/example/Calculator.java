package org.example;

public class Calculator {
    double addition(double a, double b){
        return a + b;
    }
    double subtraction(double a, double b){
        return a - b;
    }
    double multiply(double a, double b){
        return a * b;
    }
    double division(double a, double b) throws Exception {
        if (b != 0)
            return a / b;
        else
            throw new Exception("div by zero");

    }

}