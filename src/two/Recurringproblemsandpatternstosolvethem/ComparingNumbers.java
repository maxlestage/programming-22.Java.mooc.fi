package two.Recurringproblemsandpatternstosolvethem;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueOne = Integer.valueOf(scanner.nextLine());
        int valueTwo = Integer.valueOf(scanner.nextLine());

        if (valueOne > valueTwo) {
            System.out.println(valueOne + " is greater than " + valueTwo + '.');
        } else if (valueOne < valueTwo) {
            System.out.println(valueOne + " is smaller than " + valueTwo + '.');
        } else {
            System.out.println(valueOne + " equal " + valueTwo + '.');
        }

        scanner.close();
    }

}
