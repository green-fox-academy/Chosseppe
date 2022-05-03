import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;



public class F12_Sort_that_list {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[] {34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    private static int[] bubble(int[] integer_list){
        //sorting list of integer from lowest to highest number
        Arrays.sort(integer_list);
        // return si like print but with opportunity to save made operations to new array variable.
        // Print statement is not able to save to new array var.
        return integer_list;
    }

    private static int[] advancedBubble(int[] integer_list, boolean boolean_status){
        //selecting operation with int array based on boolean value
        if(boolean_status == false){
            //sorting list of integer from lowest to highest number
            Arrays.sort(integer_list);
        }else {
            //sorting list of integer from lowest to highest number
            Arrays.sort(integer_list);
            // reversing position of sorted integer list, that means numbers are from highest lo lowest
            ArrayUtils.reverse(integer_list);
        }
    // return si like print but with opportunity to save made operations to new array variable.
    // Print statement is not able to save to new array var.
    return integer_list;
    }
}
