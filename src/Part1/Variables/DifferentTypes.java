package Part1.Variables;

import java.util.Scanner;

public class DifferentTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String valueString = scanner.nextLine();
        System.out.println("Give an integer:");
        int valueInt = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double valueDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean valueBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + valueString);
        System.out.println("You gave the integer " + valueInt);
        System.out.println("You gave the double " + valueDouble);
        System.out.println("You gave the boolean " + valueBoolean);
        scanner.close();

    }

}
