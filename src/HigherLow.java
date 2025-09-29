import java.util.Scanner;
import java.util.Random;

public class HigherLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNumber = generator.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess the secret number (1-10): ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();

                // Now check if the number is in the valid range
                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("\nInvalid input: " + userGuess + ". The number must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash + ". Please enter a valid integer.");
            }
        } while (!done);

        // Output the results
        System.out.println("The secret random number was: " + randomNumber);

        if (userGuess > randomNumber) {
            System.out.println("Your guess was too high");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess was too low");
        } else {
            System.out.println("You guessed it");
        }
    }
}