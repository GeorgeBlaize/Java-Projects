import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random=new Random();
        int numberToGuess= random.nextInt(100)+1;
        int numberOfAttemps=0;
        int guess=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:" );

        while (guess!=numberToGuess){

            guess=scanner.nextInt();
            numberOfAttemps++;

            if(guess<numberToGuess){

                System.out.println("Too low!Try again.");
            }
            else if(guess>numberToGuess){
                System.out.println("Too high!Try again.");
            }
            else {
                System.out.println("Correct! You guess the number in "+numberOfAttemps);
            }

        }
        scanner.close();

    }
}
