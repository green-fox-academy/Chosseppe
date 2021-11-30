// Loads the scanner to the file
import java.util.Scanner;

public class O18_Average_of_input {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        // Creates a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int Input = scanner.nextInt();
        System.out.println("Enter the second number:");
        int Input2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int Input3 = scanner.nextInt();
        System.out.println("Enter the fourth number:");
        int Input4 = scanner.nextInt();
        System.out.println("Enter the fifth number:");
        int Input5 = scanner.nextInt();

        System.out.println("Sum of entered number is: " + (Input + Input2 + Input3 + Input4 + Input5));
        System.out.println("Average number of entered numbers is: " + ((Input + Input2 + Input3 + Input4 + Input5) / 5));

    }
}
