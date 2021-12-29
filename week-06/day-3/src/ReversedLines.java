import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts reversed-lines.txt

        Path inputPath = Paths.get("src/reversed-lines.txt");
        List<String> readFile = new ArrayList<>(Files.readAllLines(inputPath));

        reverseLines(readFile);
    }

    private static void reverseLines(List<String> inputList) throws IOException {
        StringBuilder temp = new StringBuilder();
        List<String> output = new ArrayList<>();

        for(String line : inputList){
            StringBuilder xline = new StringBuilder(line);
            for(int i = xline.length() - 1; i >= 0; i-- ){
                temp.append(xline.charAt(i));
                if(temp.length() == line.length()){
                    output.add(temp.toString());
                    temp = new StringBuilder();
                }

            }

        }
        Files.write(Path.of("src/decrypted.txt"), output);

    }
}