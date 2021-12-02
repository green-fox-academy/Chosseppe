import java.lang.StringBuilder;

public class S03_Takes_longer {
    public static void main(String... args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!


        // Use pieces of the `quote` variable, e.g. quote.substring(...), instead of just redefining the string!
        System.out.println(quote.substring(0 , quote.indexOf("you")) +
                "always takes longer than" + quote.substring(quote.indexOf(" you"))
        );
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
        StringBuilder new_quote = new StringBuilder(quote);
        new_quote.replace(new_quote.indexOf("you"), quote.indexOf("you"), "always takes longer than" + " ");
        System.out.println(new_quote);
    }
}
