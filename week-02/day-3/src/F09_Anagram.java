import java.util.Arrays;

public class F09_Anagram {
    public static void main(String[] args) {
        //Create a function named isAnagram() following your current language's style guide.
        //It should take two strings and return a boolean value depending on whether it's an anagram or not.
        System.out.println(isAnagram("dog", "god"));

        System.out.println(isAnagram("Green", "fox"));

    }

    private static boolean isAnagram(String input, String input2) {

            char[] kvp1 = input.toCharArray();
            char[] kvp2 = input2.toCharArray();

            Arrays.sort(kvp1);
            Arrays.sort(kvp2);

            return Arrays.equals(kvp1, kvp2);
    }

}
