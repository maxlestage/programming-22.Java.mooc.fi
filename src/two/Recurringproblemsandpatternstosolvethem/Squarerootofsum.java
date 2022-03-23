package two.Recurringproblemsandpatternstosolvethem;

import java.util.Scanner;

public class Squarerootofsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueOne = Integer.valueOf(scanner.nextLine());
        int valueTwo = Integer.valueOf(scanner.nextLine());

        double squareRoot = Math.sqrt(valueOne + valueTwo);
        System.out.println(squareRoot);

        scanner.close();
    }

}
