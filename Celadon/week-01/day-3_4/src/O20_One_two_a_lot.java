import java.util.Scanner;

public class O20_One_two_a_lot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot

        Scanner scanner = new Scanner(System.in);
        int Int_input = scanner.nextInt();
        if (Int_input < 0)
            System.out.println("Not enough");
        else if (Int_input == 1)
            System.out.println("One");
        else if (Int_input == 2)
            System.out.println("Two");
        else
            System.out.println("A lot");


    }
}
