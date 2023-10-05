package com.example.gruppuppgift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

        @RequestMapping("/add")
        public double useMathAddition(double d1, double d2){

            double answer = Calculator.addition(d1, d2);
            return answer;
        }
        @RequestMapping("/subtract")
        public double useMathSubtraction(double d1, double d2){

            double answer = Calculator.subtraction(d1, d2);

            return answer;
        }
        @RequestMapping("/multiply")
        public double useMathMultiplication(double d1, double d2){

            double answer = Calculator.multiplication(d1, d2);
            return answer;
        }
        @RequestMapping("/divide")
        public double useMathDivision(double d1, double d2){

            double answer = Calculator.division(d1, d2);
            return answer;
        }
}
