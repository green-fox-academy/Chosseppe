import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) throws InterruptedException {

        int searchedNumber;
        int numberOfLives;
        int minRangeOfSearchedNumber;
        int maxRangeOfSearchedNumber;
        boolean finish = false;
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the game!");
        Thread.sleep(1000);
        System.out.println("What is the number to generate random number to search from :");
        minRangeOfSearchedNumber = scanner.nextByte();
        System.out.println("What is the highest number for search from " + minRangeOfSearchedNumber + " :");
        maxRangeOfSearchedNumber = scanner.nextByte();
        System.out.println("How many lives do you want:");
        numberOfLives = scanner.nextByte();

        searchedNumber = random.nextInt(minRangeOfSearchedNumber, maxRangeOfSearchedNumber);

        Thread.sleep(1500);
        System.out.println("I'm thinking on number between " + minRangeOfSearchedNumber + " to "
                + maxRangeOfSearchedNumber + ".");
        Thread.sleep(2000);
        System.out.println("You have " + numberOfLives + " lives to find number I'm thinking on!");
        Thread.sleep(1500);
        System.out.println("Lets begin!!:");

        while(!finish){
            if(numberOfLives > 0){
                System.out.println("Guess a number between 0 and " + maxRangeOfSearchedNumber + " :");
                int playerInput = scanner.nextByte();
                if(playerInput == searchedNumber) {
                    System.out.println("Congratulations. You've won!");
                    finish = true;
                }else if(playerInput > searchedNumber){
                    numberOfLives--;
                    if(numberOfLives > 0) {
                        System.out.println("Too high, try again!");
                        System.out.println("You have " + numberOfLives + " lives.");
                    }
                }else{
                    numberOfLives--;
                    if(numberOfLives > 0) {
                        System.out.println("Too low, try again!");
                        System.out.println("You have " + numberOfLives + " lives.");
                    }
                }
            }else{
                finish = true;
                System.out.println("I'm sorry. You've run out of lives!");
            }
        }
    }
}
