import java.util.*;

public class numbergames 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 8;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!\n");
        boolean playAgain = true;

        while (playAgain) 
        {
            int targetNumber = random.nextInt(max - min + 1) + min;
            System.out.println("Round - Range: " + min + " to " + max);
            System.out.println("You have " + maxAttempts + " attempts.\n");

            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) 
                {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score += attempts;
                    guessedCorrectly = true;
                    break;
                } 
                else if (userGuess < targetNumber)
                {
                    System.out.println("Too Low! Guess again.\n");
                } 
                else 
                {
                    System.out.println("Too High! Guess again.\n");
                }
            }

            if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you have no attempts left. The correct number was " + targetNumber);
            }

            System.out.println("Your current score: " + score + "\n");
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();

            if (!playAgainResponse.equals("yes")) 
            {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Your final score: " + score);
        scanner.close();
    }
}
