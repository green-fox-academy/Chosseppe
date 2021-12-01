import java.util.Arrays;

public class F07_find_part_of_an_integer {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as parameters
        //  It returns the indices of the integers of the array which contain the given number
        //  or returns an empty array (if the number is not part of any of the integers in the array)

        //  Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function to print the array returned
        // You could just as well iterate over the array and print its items one by one
    }

    private static int[] findMatchingIndexes(int x, int[] y){
        int count =0;
        int counti =0;
        int[] ints = new int[count];
        for(int i=0; i< y.length; i++){
            if(y[i]%10 == x){
                count++;
            }
            ints = new int[count];
            if(y[i]%10 == x) {
                ints[counti] = i;
                counti++;
            }
        }
        return ints;
    }
}
