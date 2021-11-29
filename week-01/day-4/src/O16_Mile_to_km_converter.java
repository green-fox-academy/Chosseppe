// Loads the scanner to the file
import java.util.Scanner;

public class Mile_to_km_converter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);
        // The program stops and waits for user input and to press enter
        int Input = scanner.nextInt();
        // It prints the number that was given by the user converted to kilometers
        System.out.println(Input * 1.609344 + "km");
    }
}
