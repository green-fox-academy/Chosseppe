import java.lang.StringBuilder;
import java.util.HashSet;
import java.util.Set;

public class F11_Palindrome_searcher {
    /*Create a function named searchPalindrome() following your current language's style guide.
     It should take a string,
     search for palindromes that is at least 3 characters long and return a list with the found palindromes.
     */
    public static void main(String[] args) {

        System.out.println(searchPalindrome("dog goat dad duck doodle never"));

        System.out.println(searchPalindrome("apple"));

        System.out.println(searchPalindrome("racecar"));

        System.out.println(searchPalindrome(""));
    }

    private static Set<String> searchPalindrome(String str) {
        /*
        Set, represents a collection of objects where each object in the Java Set is unique.
        In other words, the same object cannot occur more than once in a Java Set.
        Is subtype of java Collection interface = Set inherits from Collection;
         */



        Set<String> output = new HashSet<>();
        for(int increment =0; increment<str.length(); increment++){
            // if str.length() - 1 racecar won't be printed,
            for(int decrement = str.length();decrement>increment + 2;decrement--){
                // substring creates shorter string from string input to searchPalindrome
                if(isPalindrome(str.substring(increment,decrement))){
                    output.add(str.substring(increment, decrement));
                }
            }
        }
        return output;
    }

    private static boolean isPalindrome(String input){
        StringBuilder palin = new StringBuilder(input);
        StringBuilder reverse = palin.reverse();
        return (reverse.toString()).equals(input);
    }

}
