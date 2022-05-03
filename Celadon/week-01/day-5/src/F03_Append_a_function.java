import java.lang.StringBuilder;

public class F03_Append_a_function {
    //  Create the usual class wrapper and main method on your own

    // - Create a string variable named `typo` and assign the value `Chinchill` to it
    // - Write a function called `appendA()` that gets a string as an input,
    //   appends an 'a' character to its end and returns the modified string
    //
    // - Print the result of `appendA(typo)`
    public static void main(String[] args) {
        StringBuilder typo =new StringBuilder("Chinchill");

        appendA(typo);
        System.out.println(typo);
    }

    private static void appendA(StringBuilder str){
        str = str.append("a");

    }
}
