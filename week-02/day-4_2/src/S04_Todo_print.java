import java.lang.StringBuffer;

public class S04_Todo_print {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention

        // Expected output:

        // My todo:

        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuffer todoTexts = new StringBuffer(todoText);
        // add My todo: to begining of text
        todoTexts.insert(0, "My todo:\n");
        // add  - Download games to the end of text,
        todoTexts.append(" - Download games\n");
        // add  - Diablo to the end of previous text added to text
        todoTexts.append("     - Diablo\n");


        System.out.println(todoTexts);
    }
}
