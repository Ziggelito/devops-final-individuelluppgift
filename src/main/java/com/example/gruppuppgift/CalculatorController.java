package com.example.gruppuppgift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

        @RequestMapping("/add")
        public double useAdditionChange(double d1, double d2){

            double answer = Calculator.addition(d1, d2);
            return answer;
        }
        @RequestMapping("/subtract")
        public double useSubtraction(double d1, double d2){

            double answer = Calculator.subtraction(d1, d2);

            return answer;
        }
        @RequestMapping("/multiply")
        public double useMultiplication(double d1, double d2){

            double answer = Calculator.multiplication(d1, d2);
            return answer;
        }
        @RequestMapping("/divide")
        public double useDivision(double d1, double d2){

            double answer = Calculator.division(d1, d2);
            return answer;
        }
}
