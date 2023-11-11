package Task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	int minRange = 1;
	int maxRange =100;
	int attempts = 5;
	int score = 0;
	
	System.out.println("Welcome to the Number Game");
	System.out.println("Guess the number between " + minRange + " and " + maxRange );
	
	boolean playAgain = true;
	
	while(playAgain)
	{
		int  targetNumber = random.nextInt(maxRange - minRange + 1)+ minRange;
		int currentAttempts = 0;
		
		System.out.println("New round! you have " + attempts + " attempts");
		
		while(currentAttempts < attempts)
		{
			System.out.println("Enter your Guess ");
			int userGuess = sc.nextInt();
			
			if(userGuess < minRange || userGuess > maxRange)
			{
				System.out.println("Please Enter a number within the specified range ");
			}else if(userGuess < targetNumber)
			{
				System.out.println("Your Guess is to low, Try Again ");
			}else if(userGuess > targetNumber)
			{
				System.out.println("Your Guess is to high, Try Again ");
			}else {
				System.out.println("Congratulations You guessed the correct number " + targetNumber);
				score++;
				break;
			}
			
			currentAttempts++;
			if(currentAttempts == attempts)
			{
				System.out.println("Out of attempts. The correct number was " + targetNumber);
			}
		}
		
		System.out.println("Play another round? (yes/no): ");
		String PlayAnotherRound = sc.next().toLowerCase();
		if(!PlayAnotherRound.equals("yes"))
		{
			playAgain = false;
		}
	}
	
	System.out.println("Game Over!");
	System.out.println("Your score: " + score);
	
	sc.close();
	 
	
	
}
}
