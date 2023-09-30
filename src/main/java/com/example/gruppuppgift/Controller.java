package com.example.gruppuppgift;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class Controller {
    @RestController
    public class CalculatorController {

        @RequestMapping("/add")
        public double useAddition(double d1, double d2){

            double answer = Calculator.addition(d1, d2);
            return answer;
        }
    }
}
