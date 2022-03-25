package two.Repeatingfunctionality;

import java.util.Scanner;

public class NumberofNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ref = 0;

        while (true) {

            int value = Integer.valueOf(scanner.nextLine());

            if (value != 0) {
                ref++;

            } else {
                System.out.println("Number of numbers: " + ref);
                break;
            }
        }

        scanner.close();
    }
}
