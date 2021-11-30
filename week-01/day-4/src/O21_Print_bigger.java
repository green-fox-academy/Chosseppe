import java.util.Scanner;

public class O21_Print_bigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();
        int Input_2 = scanner.nextInt();

        if (Input > Input_2)
            System.out.println("Bigger number is: " + Input);
        else if (Input < Input_2)
            System.out.println("Bigger number is: " + Input_2);
        else
            System.out.println("Both numbers are the same!");
    }
}
