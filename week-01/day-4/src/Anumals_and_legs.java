// Loads the scanner to the file
import java.util.Scanner;

public class Anumals_and_legs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        int Input = scanner.nextInt();
        Input *= 2;

        int Input2 = scanner.nextInt();
        Input2 *= 4;

        // It prints the integer
        System.out.println(Input + Input2);
    }
}
