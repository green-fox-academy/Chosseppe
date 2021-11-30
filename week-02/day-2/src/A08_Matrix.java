public class A08_Matrix {
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args) {


        int[][] matrix = new int[4][4];

        for (int counter= 0; counter < 4; counter++) {
            for (int counter2 = 0; counter2 < 4; counter2++) {
                if (counter==counter2) {
                    matrix[counter][counter2] = 1;
                } else {
                    matrix[counter][counter2] = 0;
                }
            }
        }
    }
}
