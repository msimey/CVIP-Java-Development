import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class GuessNum{
	public static int numOfGuess=1;
	public static boolean guessIsRight = false;
	public void NumberGuess(int number, int guess){
		if(guess >=1 && guess <=100){
			if(number == guess){
				System.out.println("\n\nHit the Bull's eye!!! Congratulations, you guessed it right in your " + numOfGuess + "th try");
				guessIsRight = true;
			}
			else if(guess > number){
				if(guess - number > 5){
					System.out.println("Too high, try guessing a lower value.");
				}
				else if(guess - number <= 5){
					System.out.println("Pretty close, try a bit lower!");
				}
			}
			else if(guess < number){
				if(number - guess > 5){
					System.out.println("Too low, try guessing a higher value.");
				}
				else if(number - guess <= 5){
					System.out.println("Pretty close, try a bit higher!");
				}
			}
		}
		else{
			System.out.println("Invalid guess:(");
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int high = 100;
		int low = 1;
		int number = rand.nextInt(high - low +1)+low;
		while(!guessIsRight){
			System.out.println("\nWhat is your guess?(has to be from 1-100)");
			int guess = sc.nextInt();
			GuessNum gn = new GuessNum();
			gn.NumberGuess(number, guess);
			numOfGuess++;
		}
	}
}