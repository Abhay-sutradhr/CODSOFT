import java.util.*;

public class numbergames 
{
    public static void main(String args[]) 
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
            System.out.printf("Round - Range: %d to %d\n", min, max);
            System.out.println("You have " + maxAttempts + " attempts.\n");
            int attempts = 0;
            boolean guessed_Correctly = false;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int user_Guess = scanner.nextInt();
                attempts++;
                if (user_Guess == targetNumber) {
                    System.out.printf("Correct! You guessed the number in %d attempts.\n", attempts);
                    score += attempts;
                    guessed_Correctly = true;
                    break;
                } 
                else if (user_Guess < targetNumber) 
				{
                    System.out.println("Guess higher! Try again.\n");
                } 
                else 
				{
                    System.out.println("Guess lower! Try again.\n");
                }
            }
            if (!guessed_Correctly) 
			{
                System.out.println("Sorry, you have no attempts left. The correct number was " + targetNumber);
            }
            System.out.println("Your current score: " + score + "\n");
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) 
			{
                playAgain = false;
            }
        }
        System.out.println("Thank you for playing! Your final score: " + score);
        //scanner.close();
    }
}