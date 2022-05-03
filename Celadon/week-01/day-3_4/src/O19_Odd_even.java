import java.util.Scanner;
public class O19_Odd_even {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();

        if (Input % 2 ==0)
            System.out.println("Entered number is Even");
        else
            System.out.println("Entered number is Odd");
    }
}
