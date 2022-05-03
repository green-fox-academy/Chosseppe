import java.util.Scanner;

public class O35_Parametric_average {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times would you like to enter integer?");
        float times = scanner.nextInt();
        int input = 0;

        for (int i = 0; i < times; i++) {
            System.out.println("Enter number " + (i + 1));
            input += scanner.nextInt();
        }
        System.out.println("Sum of entered number is: " + input);
        System.out.println("Average number of entered numbers is: " + (input / times));

    }
}
