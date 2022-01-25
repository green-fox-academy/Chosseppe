import java.util.Arrays;

public class F09_Anagram {
    public static void main(String[] args) {
        //Create a function named isAnagram() following your current language's style guide.
        //It should take two strings and return a boolean value depending on whether it's an anagram or not.
        System.out.println(isAnagram("dog", "god"));

        System.out.println(isAnagram("Green", "fox"));

    }

    private static boolean isAnagram(String input, String input2) {

            char[] list1 = input.toCharArray();
            char[] list2 = input2.toCharArray();

            Arrays.sort(list1);
            Arrays.sort(list2);

            return Arrays.equals(list1, list2);
    }

}
