package com.lethokuhle;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double firstNumber = 0, secNumber = 0, answer = 0;
        int operation = 0;
        MathOperations operations = new MathOperations();

        while (true) {

            try {

                System.out.println("1. Add \n2. Subtract\n3.Divide\n4.Multiply\n5.Close Calculator");
                operation = scan.nextInt();

                if (operation == 5) {
                    break;
                }
                if (!(operation > 1 || operation < 5)) {
                    System.out.println("Invalid Option");
                    continue;
                }

                System.out.println("Enter the first Number");
                firstNumber = scan.nextDouble();

                System.out.println("Enter the second Number");
                secNumber = scan.nextDouble();

            } catch (InputMismatchException n) {

                System.out.println("Please enter a valid number");
                scan.next();
                continue;

            }

            if (operation == 1) {

                answer = operations.add(firstNumber, secNumber);
                System.out.println("Answer = " + answer);

            } else if (operation == 2) {

                answer = operations.subtract(firstNumber, secNumber);
                System.out.println("Answer = " + answer);

            } else if (operation == 3) {

                if (secNumber == 0) {
                    System.out.println("Division by zero is prohibited");

                } else {
                    answer = operations.divide(firstNumber, secNumber);
                    System.out.println("Answer = " + answer);
                }

            } else if (operation == 4) {
                answer = operations.multiply(firstNumber, secNumber);
                System.out.println("Answer = " + answer);

            }
        }

    }
}
