package com.game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input;
        int randomNum = generateNumber();
        boolean found = false;

        System.out.println("You have five attempts to guess the right number");

        for (int i = 1; i <= 5; i++) {

            try {

                System.out.println("Enter a number between 1 and 10\nAttempt no. " + i);
                input = scan.nextInt();

                if (input < 1 || input > 10) {

                    System.out.println("Please enter A number between 1 and 10");
                    i--;

                } else if (input > randomNum) {

                    System.out.println("Too high try again");

                } else if (input < randomNum) {

                    System.out.println("Too low try again");

                } else if (input == randomNum) {
                    System.out.println("Correct!!!\nAnswer: " + randomNum);
                    found = true;
                    break;
                }

            } catch (InputMismatchException n) {

                System.out.println("Invalid Input");
                scan.next();
                i--;
                continue;

            }

        }

        if (!found) {

            System.out.println("Failed, Try Again Next time\n Correct answer: " + randomNum);
        }

    }

    public static int generateNumber() {

        int number = 0;

        Random random = new Random();

        number = random.nextInt(1, 10 + 1);
        return number;

    }
}
