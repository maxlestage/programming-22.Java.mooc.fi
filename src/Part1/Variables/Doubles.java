package part1.variables;

import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote " + value);
        scanner.close();

    }

}
