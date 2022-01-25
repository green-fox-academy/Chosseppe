public class O36_Draw_chess_table {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        int chess = 8;

        for (int i = 1; i <= chess; i++) {
            System.out.println();
            for (int j = 1; j <= chess; j++) {
                if ((i + j) % 2 == 0 )
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
        }
    }
}
