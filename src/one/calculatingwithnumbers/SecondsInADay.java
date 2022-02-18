package one.calculatingwithnumbers;

import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int day = Integer.valueOf(scanner.nextLine());
        int second = 60;
        int hour = 60;
        int secondInOneHour = second * hour;
        int secondsInADay = secondInOneHour * 24;
        int convertDayInSeconds = secondsInADay * day;
        System.out.println(convertDayInSeconds);
        scanner.close();

    }

}

// Dans une minute on trouve 60 secondes, 1heure représente 60 min
// Un jour représente 24 heures.

// 60sec fois 60min = 3600sec
// 3600sec * 24h = 86400
// un jour représente 86400 secondes
