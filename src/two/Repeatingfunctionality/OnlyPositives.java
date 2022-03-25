package two.Repeatingfunctionality;

import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value < 0) {
                System.out.println("Unsuitable number");
            } else if (value == 0) {
                break;
            } else {
                int sum = value * value;
                System.out.println(sum);
            }

        }

        scanner.close();
    }

}
