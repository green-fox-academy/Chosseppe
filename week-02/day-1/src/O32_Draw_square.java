import java.lang.StringBuilder;

public class O32_Draw_square {
    public static void main(String[] args) {
        int lineCount = 6;
        // Write a program that draws a square like this:
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as lineCount is

        drawSquare(lineCount);

    }

    private static void drawSquare(int lineCount) {
        // write your code here for Gradescope testing
        String Star;
        StringBuilder output = null;
        for(int i = 0; i < lineCount; i++) {
            if (i == 0 || i == lineCount - 1) {
                for (Star = "%"; Star.length() <= lineCount; Star += '%')
                    if (Star.length() == lineCount)
                        System.out.println(Star);

            }else {
                for (Star = "%"; Star.length() <= lineCount - 1; Star += ' ')
                    if (Star.length() == lineCount - 1)
                        output = new StringBuilder(Star).append("%");

                System.out.println(output);
            }

        }
    }
}
