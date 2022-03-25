package two.Repeatingfunctionality;

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shall we carry on?");

        while (true) {
            String value = String.valueOf(scanner.nextLine());

            if (value.equals("no")) {
                break;
            }

            System.out.println("Shall we carry on?");
        }

        scanner.close();
    }
}