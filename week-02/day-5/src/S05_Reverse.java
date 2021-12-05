import java.lang.StringBuilder;

import static org.apache.commons.lang3.StringUtils.reverse;

public class S05_Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done


        // reverse2 resolved with method,
        System.out.println(reverse2(toBeReversed));
        // reverse resolved with StringUtils
        System.out.println(reverse(toBeReversed));
    }

    private static StringBuilder reverse2(String str){
        StringBuilder output = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            output.append(str.charAt(i));
        }
        return output;
    }
}

