import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Your guess is too low.");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            }
        } while (guess != number);
        System.out.println("Congratulations! You guessed the correct number.");
    }
}

