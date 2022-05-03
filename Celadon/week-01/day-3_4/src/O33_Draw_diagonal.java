import java.lang.StringBuilder;
import java.util.Scanner;

public class O33_Draw_diagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        System.out.println("Enter odd number: ");
        Scanner scanner = new Scanner(System.in);

        int Uinput = scanner.nextInt();

        String Star;
        StringBuilder output = null;
        for(int i = 0; i < Uinput; i++) {
            if (i == 0 || i == Uinput - 1) {
                for (Star = "%"; Star.length() <= Uinput; Star += '%')
                    if (Star.length() == Uinput)
                        System.out.println(Star);

            } else {
                for (Star = "%"; Star.length() <= Uinput - 1; Star += ' ')
                    if (Star.length() == Uinput - 1)
                        output = new StringBuilder(Star).append("%").replace(i, i +1, "%");

                System.out.println(output);
            }
        }
    }
}
