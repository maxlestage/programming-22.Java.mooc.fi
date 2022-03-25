package two.Repeatingfunctionality;

import java.util.Scanner;

public class NumberofNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ref = 0;

        while (true) {

            int value = Integer.valueOf(scanner.nextLine());

            if (value > 0) {
                System.out.println("Number of numbers: " + ref);

            } else {
                ref++;
                System.out.println("Number of numbers: " + ref);
                break;
            }
        }

        scanner.close();
    }
}
