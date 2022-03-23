package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        /*
         * Write a program that prompts the user for an integer and informs the user
         * whether or not it is positive (greater than zero).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());

        if (value > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        scanner.close();

    }
}
