import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lower_bound = 1; 
        int upper_bound = 100;
        int user_guess; 
        int random_number = 1 + (int)(100 * Math.random());
        int number_of_trials = 0;
        boolean correct_guess = false;

        System.out.println("Let's start the Number Guessing Game!");
        System.out.println("A number is selected between " + lower_bound + " and " + upper_bound );
        System.out.println("Make a try to guess that selected number.");

        while (correct_guess=true) 
        {
            System.out.print("Enter your guess: ");
            user_guess = scanner.nextInt();
            number_of_trials++;

            if (user_guess < lower_bound || user_guess > upper_bound) 
            {
                System.out.println("Your number is out of range. Please enter a number within range.");
            }
            else if (user_guess < random_number) 
            {
                System.out.println("The number is greater than "+user_guess);
            }
            else if (user_guess > random_number) 
            {
                System.out.println("The number is lesser than "+user_guess);
            } 
            else 
            {
                correct_guess= true;
                System.out.println("Congratulations! You've guessed the number " + random_number + " in " + number_of_trials + " attempts.");
            }
        }

        scanner.close();
    }
}