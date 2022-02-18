package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class LargerThanorEqualTo {
    public static void main(String[] args) {

        /*
         * Write a program that prompts the user for two integers and prints the larger
         * of the two. If the numbers are the same, then the program informs us about
         * this as well.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scanner.nextLine());

        if (firstValue > secondValue) {
            System.out.println("Greater number is: " + firstValue);
        } else if (firstValue < secondValue) {
            System.out.println("Greater number is: " + secondValue);
        } else {
            System.out.println("The numbers are equal!");
        }

        scanner.close();
    }
}
