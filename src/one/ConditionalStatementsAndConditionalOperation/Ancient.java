package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        /*
         * Write a program that prompts the user for a year. If the user inputs a number
         * that is smaller than 2015, then the program prints the string
         * "Ancient history!".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year:");

        int value = Integer.valueOf(scanner.nextLine());

        if (value < 2015) {
            System.out.println("Ancient history!");
        }

        scanner.close();

    }
}
