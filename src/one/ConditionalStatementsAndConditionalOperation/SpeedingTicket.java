package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        /*
         * Write a program that asks the user for an integer and prints the string
         * "Speeding ticket!" if the input is greater than 120.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed: ");

        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }

        scanner.close();
    }

}
