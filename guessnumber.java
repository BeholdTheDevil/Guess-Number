import java.io.*;
import java.util.*;

public class guessnumber {
	public static void main(String[] args) {

		//Settings
		int roof = 100;
		int guesses = 3;

		//Instances of scanner and random
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		//Variables needed
		int ans = random.nextInt(roof);
		boolean correct = false;
		int guess;

		System.out.println("Make a guess between 0 and 100");

		for(int i = 1; i <= guesses; ++i) {
			//Scan for integer
			guess = scan.nextInt();
			//Quick error checking
			if(guess < 0 || guess > 100) {
				--i;
			}

			//Correct answer
			if(guess == ans) {
				System.out.println("You guessed it right with " + (guesses - i) + " guesses left!");
				correct = true;
				break;

			//Guess is less than the correct answer 
			} else if(guess < ans) {
				System.out.println("Your guess " + guess + " was lower than the answer");

			//Guess is grater than the correct answer
			} else if(guess > ans) {
				System.out.println("Your guess " + guess + " was higher than the answer");
			}
			System.out.println("Make another guess!");
		}
		//Check if answer was correct, if not print out correct answer
		if(!correct) {
			System.out.println(" \nI'm sorry you're out of guesses. The answer was " + ans + ". Please try again!");
		}
	}
}