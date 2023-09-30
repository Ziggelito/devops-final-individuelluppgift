package com.example.gruppuppgift;

public class Calculator {

    public static double addition(double d1, double d2){
        double answer = d1 + d2;
        return answer;
    }

    public double subtraction(double d1, double d2){
        double answer = d1 - d2;
        return answer;
    }
    public double multiplication(double d1, double d2){
        double answer = d1 * d2;
        return answer;
    }
    public double division(double d1, double d2){
        if(d2 == 0){
            throw new ArithmeticException("Dividing by zero");
        }
        double answer = d1 / d2;
        return answer;
    }
}
