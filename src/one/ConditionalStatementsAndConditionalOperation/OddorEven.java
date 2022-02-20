package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        /*
         * Write a program that prompts the user for a number and informs us whether it
         * is even or odd.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int value = Integer.valueOf(scanner.nextLine());

        if (value % 2 == 0) {
            System.out.println("Number " + value + " is even.");
        } else {
            System.out.println("Number " + value + " is odd.");
        }

        scanner.close();
    }
}
