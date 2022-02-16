package Part1.ReadingInput;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1
        System.out.println("Greetings! How are you doing?");
        String first = scanner.nextLine();
        System.out.println(first);
        // 2
        System.out.println("Oh, how interesting. Tell me more!");
        String second = scanner.nextLine();
        System.out.println(second);

        // 3
        System.out.println("Thanks for sharing!");

        // End
        scanner.close();
    }
}
