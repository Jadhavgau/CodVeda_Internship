import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; 
        int upperBound = 100; 
        int maxAttempts = 5; 

        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + lowerBound + " and " + upperBound);
        System.out.println("You have " + maxAttempts + " attempts.");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); 
                continue;
            }

            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                guessedCorrectly = true;
                break;
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry! You've used all attempts. The number was " + numberToGuess + ".");
        }

        sc.close();
    }
}
