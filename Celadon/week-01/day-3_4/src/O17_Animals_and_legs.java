// Loads the scanner to the file
import java.util.Scanner;

public class O17_Animals_and_legs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of chickens: ");
        // wait for input
        int Input = scanner.nextInt();
        // multiplies input to represent number of legs
        Input *= 2;

        System.out.println("Enter number of pigs: ");
        // wait for input
        int Input2 = scanner.nextInt();
        // multiplies input to represent number of legs
        Input2 *= 4;

        // It prints the integer
        System.out.println("Total sum of legs for chickens and pigs is: " + (Input + Input2));
    }
}
