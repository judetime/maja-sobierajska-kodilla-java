package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(1, 2);

        if (sum == 1 + 2) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

        int diff = calculator.subtract(3, 1);

        if (diff == 3 - 1) {
            System.out.println("Fine");
        } else {
            System.out.println("Not Fine");
        }
    }
}
