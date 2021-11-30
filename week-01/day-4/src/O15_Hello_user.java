// Loads the scanner to the file
import java.util.Scanner;

public class O15_Hello_user {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();

        System.out.println("Hello, " + Input + "!");
    }
}
