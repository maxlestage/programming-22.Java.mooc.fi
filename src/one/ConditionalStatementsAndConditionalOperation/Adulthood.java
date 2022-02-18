package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {

        /*
         * Write a program that prompts the user for their age and tells them whether or
         * not they are an adult (18 years old or older).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");

        int value = Integer.valueOf(scanner.nextLine());

        if (value < 18) {
            System.out.println("You are not an adult");
        } else {
            System.out.println("You are an adult");
        }

        scanner.close();
    }
}
