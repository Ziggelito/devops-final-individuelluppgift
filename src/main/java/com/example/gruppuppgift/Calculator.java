package com.example.gruppuppgift;

public class Calculator {

    public static double addition(double d1, double d2){
        double answer = d1 + d2;
        return answer;
    }

    public static double subtraction(double d1, double d2){
        double answer = d1 - d2;
        return answer;
    }
    public static double multiplication(double d1, double d2){
        double answer = d1 * d2;
        return answer;
    }
    public static double division(double d1, double d2){
        if(d2 == 0){
            throw new ArithmeticException("Dividing by zero");
        }
        double answer = d1 / d2;
        return answer;
    }
}
