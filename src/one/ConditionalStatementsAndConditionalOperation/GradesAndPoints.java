package one.ConditionalStatementsAndConditionalOperation;

import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {

        /*
         * 
         * The table below describes how the grade for a particular course is
         * determined. Write a program that gives a course grade according to the
         * provided table.
         * 
         * points grade
         * < 0 impossible!
         * 0-49 failed
         * 50-59 1
         * 60-69 2
         * 70-79 3
         * 80-89 4
         * 90-100 5
         * > 100 incredible!
         * 
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int value = Integer.valueOf(scanner.nextLine());

        if (value < 0) {
            System.out.println("impossible!");
        } else if (value <= 49) {
            System.out.println("failed");
        } else if (value >= 50 && value <= 59) {
            System.out.println("1");
        } else if (value >= 60 && value <= 69) {
            System.out.println("2");
        } else if (value >= 70 && value <= 79) {
            System.out.println("3");
        } else if (value >= 80 && value <= 89) {
            System.out.println("4");
        } else if (value >= 90 && value <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible");
        }

        scanner.close();
    }

}
