import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts encoded-lines.txt

        decryption("encoded-lines.txt");
    }

    private static void decryption(String inputString) throws IOException {
        StringBuilder newString = new StringBuilder();
        List<String> output = new ArrayList<>();
        List<String> file = new ArrayList<>(Files.readAllLines(Paths.get("src/" + inputString), StandardCharsets.UTF_8));
        for(String line : file){
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == ' '){
                    newString.append(line.charAt(i));
                }else{
                    int asciiChar = line.charAt(i);
                    char c = (char) (asciiChar - 1);
                    newString.append(c);
                    if(newString.length() == line.length()) {
                        output.add(newString.toString());
                        newString = new StringBuilder();
                    }
                }
            }
        }
        for(String line : output){
            System.out.println(line);
        }
        Files.write(Paths.get("src/encoded-lines-decrypted.txt"), output, StandardCharsets.UTF_8);
    }
}
