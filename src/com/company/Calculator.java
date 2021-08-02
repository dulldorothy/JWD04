package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final String menu;
        menu = "1 - Division / ;\n" +
                "2 - Multiply * \n" +
                "3 - Addition + \n" +
                "4 - Subtraction - \n" +
                "5 - Square Root\n" +
                "6 - Exponent\n" +
                "0 - Exit\n" +
                "**********************";
        new Calculator().ascii();
        boolean isRunning = true;
        CalcLogic calc = new CalcLogic();
        while (isRunning) {
            System.out.println(menu);
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("a / b");
                    calc.div();
                    break;
                }
                case 2:
                    System.out.println("a * b");
                    calc.mult();
                    break;
                case 3:
                    System.out.println("a + b");
                    calc.add();
                    break;
                case 4:
                    System.out.println("a - b");
                    calc.sub();
                    break;
                case 5:
                    System.out.println("sqrt(a)");
                    calc.sqrt();
                    break;
                case 6:
                    System.out.println("a ^ b");
                    calc.exp();
                    break;
                case 0: {
                    System.out.println("...");
                    isRunning = false;
                    break;
                }
                default:
                    System.out.println("Incorrect input");
            }
            System.out.println("**********************");
        }

    }

    private void ascii() {
        System.out.println("Calculator");
    }
}
