package part1.variables;

import java.util.Scanner;

public class ExtraSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a value ");
        int data = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + data);
        scanner.close();
    }
}
