package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        /*
         * Write a program that prompts the user for a password. If the password is
         * "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints
         * "Off with you!"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");

        String value = String.valueOf(scanner.nextLine());
        String pass = "Caput Draconis";

        // Utilisation de equals() pour comparer le type Strings

        if (value.equals(pass)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

        scanner.close();
    }
}
