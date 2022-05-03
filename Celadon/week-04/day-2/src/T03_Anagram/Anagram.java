package T03_Anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String input, String input2) {

        char[] list1 = input.toCharArray();
        char[] list2 = input2.toCharArray();

        Arrays.sort(list1);
        Arrays.sort(list2);

        return Arrays.equals(list1, list2);
    }
}
