package two.Recurringproblemsandpatternstosolvethem;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // On stock la valeur reçu par scanner dans une variable value :
        int value = Integer.valueOf(scanner.nextLine());

        // La somme au carré de la valeur :
        int sum = value * value;

        // Print la valeur de sum :
        System.out.println(sum);

        scanner.close();
    }
}
