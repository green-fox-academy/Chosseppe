import java.util.Scanner;

public class O29_Draw_triangle {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        String Star;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int Input_2 = input.nextInt();

        for (Star = "*"; Star.length() <= Input_2; Star += '*')
            System.out.println(Star);
            System.out.println();



    }
}
