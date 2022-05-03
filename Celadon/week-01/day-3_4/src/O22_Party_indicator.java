import java.util.Scanner;

public class O22_Party_indicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys

        Scanner scanner = new Scanner(System.in);

        int Input = scanner.nextInt();
        int Input_2 = scanner.nextInt();

        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!
        if (Input + Input_2 >= 20)
            if (Input == Input_2)
                System.out.println("The party si Excellent!");
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        // it should print: Quite a cool party!
            else
                System.out.println("Quite a cool party!");
        // If there are less people coming than 20
        // it should print: Average party...
        else
            System.out.println("Average party...");
        // If no girls are coming, regardless the count of the people
        // it should print: Sausage party
        if (Input == 0)
            System.out.println("Sausage party");

    }
}
