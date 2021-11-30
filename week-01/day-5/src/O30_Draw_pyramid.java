public class O30_Draw_pyramid {
    public static void main(String[] args) {
        //initialization of variable
        int line_count = 4;

        drawPyramid(line_count);

    }
    public static void drawPyramid(int line_count) {
        // write your code here for Gradescope testing
        // loop defining rows
        int  star = 0;
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
    }
}
