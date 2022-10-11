package classLab2;
import java.util.Scanner;
import java.util.Random;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int guess, answer, attemptsNum = 0;
		final int maxAttempts = 5;
		
		Random rand = new Random();
		answer = rand.nextInt(11);
		
		System.out.println(" Guess a number between 1 and 10");
		System.out.println(" Enter your guess (0 to quit): ");
		
		
		{
			guess = sc.nextInt();
			while (guess != 0);
			{
				if(guess == answer)
					System.out.println("Right Answer!");
				else if (guess<answer)
					System.out.println("Your guess was too Low. ");
				else if (guess>answer)
					System.out.println("Your guess was too High.");
				
			}
			while (guess != answer && ++attemptsNum < maxAttempts)
				if (attemptsNum == maxAttempts)
					System.out.println (" The number was " + answer);
			
		}
		sc.close();
	}
		
	
	
}
		
	
		
	
		
		


