import java.util.Random;
import java.util.Scanner;

public class O34_Guess_the_number {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8
        Random randomint = new Random();
        int randint = randomint.nextInt(501);

        Scanner scanner = new Scanner(System.in);
        int  answer;
        while(true) {
            System.out.println("Enter your number between 0 and 500");
            answer = scanner.nextInt();
            if (answer == randint) {
                System.out.println("You found the number! Stored number was: " + randint);
                break;
            }else if (answer < randint) {
                System.out.println("The stored number is higher!");
            }else
                System.out.println("The stored number is lower!");
        }

    }
}
