import java.lang.StringBuilder;

public class F10_create_palindrome<list> {
    /*
    Create a function named createPalindrome() following your current language's style guide.
    It should take a string, create a palindrome from it and then return it.
     */

    public static void main(String[] args) {

        System.out.println(createPalindrome("greenfox"));

        System.out.println(createPalindrome("123"));


    }

    private static StringBuilder createPalindrome(String str) {

        StringBuilder list = new StringBuilder(str);

        StringBuilder list2 = new StringBuilder(str).reverse();



        return list.append(list2);
    }

}
