package part1.readingInput;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("I will tell you a story, but I need some information first.");
            System.out.println("What is the main character called?");

            // Name
            String name = scanner.nextLine();

            // Job
            String job = scanner.nextLine();

            // Story
            System.out.println("Here is the story:");

            System.out.println("Once upon a time there was " + name + ", who was " + job + ". " + "On the way to work, "
                    + name + " reflected on life. Perhaps " + name + " will not be " + job + " forever.");
        }

    }

}

/*
 * output exemple :
 * 
 * I will tell you a story, but I need some information first.
 * What is the main character called?
 * Ada
 * What is their job?
 * a Data scientist
 * Here is the story:
 * Once upon a time there was Ada, who was a Data scientist.
 * On the way to work, Ada reflected on life.
 * Perhaps Ada will not be a Data scientist forever.
 * 
 */