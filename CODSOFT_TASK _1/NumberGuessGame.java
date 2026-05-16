package com.game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

    public static int playGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int maxAttempts = 10;
        int attempts = 0;

        System.out.println("\nWelcome to the Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (attempts < maxAttempts) {

            System.out.print("\nEnter your guess (" + (maxAttempts - attempts) + " attempts left): ");
            int guess = sc.nextInt();

            attempts++;

            if (guess == number) {
                int score = (maxAttempts - attempts + 1) * 10;

                System.out.println("\nCorrect! You guessed the number in " + attempts + " attempts.");
                System.out.println("Score: " + score);

                return score;
            }

            else if (guess > number) {
                System.out.println("Your guess is too high.");
            }

            else {
                System.out.println("Your guess is too low.");
            }
        }

        System.out.println("\nGame Over! The correct number was " + number);
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        String choice;

        do {
            totalScore += playGame();

            System.out.print("\nDo you want to play again? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nFinal Score: " + totalScore);
        System.out.println("Thank you for playing.");
    }
}