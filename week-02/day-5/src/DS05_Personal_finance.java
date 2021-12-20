import java.util.Arrays;
import java.util.List;
import java.lang.*;

import static java.lang.Integer.sum;

public class DS05_Personal_finance {
    public static void main(String[] args) {
        //We are going to represent our expenses in a list containing integers.

        /*
        Create a list with the following items:
            500, 1000, 1250, 175, 800 and 120
         */
        List<Integer> expenses= Arrays.asList(500, 1000, 1250, 175, 800, 120);
        /*
        Create an application which prints out the answers to the following questions:
            todo: How much did we spend?
            todo: Which was our greatest expense?
            todo: Which was our cheapest spending?
            todo: What was the average amount of our spendings? (print this as a float value)
         */
        for(int item:spending(expenses)){
            System.out.println(item);
        }
        System.out.println(spending(expenses).get(0)/expenses.size());
    }
    private static List<Integer> spending(List<Integer> lst) {
        int countt = 0;
        int highest = 0;
        int smallest = lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            countt = sum(countt, lst.get(i));
            if (highest < lst.get(i)) {
                highest = lst.get(i);
            }
            if (smallest > lst.get(i)) {
                smallest = lst.get(i);
            }
        }
        List<Integer> output = Arrays.asList(countt, highest, smallest);

        return output;

    }
}
