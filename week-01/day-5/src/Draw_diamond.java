import java.util.Scanner;

public class Draw_diamond {
    // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialization of variables
        System.out.print("enter number of rows for diamond:");
        int line_count = scanner.nextInt(), star = 0;
        // loop defining rows
        for (int i = 1; i <= line_count; ++i, star = 0) {
            // loop defining number of spaces for each row
            for (int space = 1; space <= line_count - i; ++space) {
                System.out.print(" ");
            }
            // loop defining number of asterixs for each row with spaces
            while (star != 2 * i - 1) {
                System.out.print("*");
                ++star;
            }

            System.out.println();
        }
            for(int i = line_count -1; i >= 1; --i) {
                for(int space = 1; space <= line_count - i; ++space) {
                    System.out.print(" ");
                }

                for(star=i; star <= 2 * i - 1; ++star) {
                    System.out.print("*");
                }
                // loop defining number of asterixs for each row with spaces
                for(star = 0; star < i - 1; ++star) {
                    System.out.print("*");
                }

                System.out.println();
        }
    }
}
