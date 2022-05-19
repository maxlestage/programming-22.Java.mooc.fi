package two.Repeatingfunctionality;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {

            int value = Integer.valueOf(scanner.nextLine());

            sum = sum + value;
            System.out.println("Number of numbers: " + sum);

            if (value == 0) {
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }

        scanner.close();
    }
}
