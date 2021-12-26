import java.util.*;

public class IsInList{
    public static void main(String... args){

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);

        // Write a method called `checkNumbers` (with a list of numbers as a parameter), which will return `true`
        // if the list `numbers` contains all the following elements: 4, 8, 12, 16; `false` otherwise.

        // The output should be "true"
        System.out.println(checkNumbers(numbers));

        // Bonus: write a method called `checkAllNumbers` with 2 lists as parameters, which will return `true`
        // if the first list contains all the elements of the second list; `false` otherwise.
        List<Integer> haystack = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
        List<Integer> needles = Arrays.asList(1, 3, 13);

        // The output should be "true"
        System.out.println(checkAllNumbers(haystack, needles));
    }

    private static boolean checkNumbers(List<Integer> inputList){
        if(inputList.contains(4) && inputList.contains(8) && inputList.contains(12) && inputList.contains(16)){
            return true;
        }else{
            return false;
        }
    }

    private static boolean checkAllNumbers(List<Integer> inputList, List<Integer> inputList2){
        int trueStatement = 0;
        for(Integer number : inputList2){
            if(inputList.contains(number)){
                trueStatement++ ;
            }
        }
        if(inputList2.size() == trueStatement){
            return true;
        }else{
            return false;
        }
    }
}