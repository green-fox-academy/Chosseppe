public class Draw_pyramid {
    public static void main(String[] args) {
        //initialization of variables
        int line_count = 4, star = 0;
        // loop defining rows
        for (int i = 1; i <= line_count; ++i, star = 0) {
            // loop defining number of spaces for each row
            for (int space = 1; space <= line_count - i; ++space) {
                System.out.print(" ");
            }
            // loop defining number of asterixs for each row with spaces
            while (star != 2 * i -1) {
                System.out.print("*");
                ++star;
            }

            System.out.println();
        }
    }
}
