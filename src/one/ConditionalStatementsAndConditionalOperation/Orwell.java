package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {

        /*
         * Write a program that prompts the user for an integer and prints the string
         * "Orwell" if the number is exactly 1984.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int value = Integer.valueOf(scanner.nextLine());

        if (value == 1984) {
            System.out.println("Orwell");
        }

        scanner.close();
    }
}
