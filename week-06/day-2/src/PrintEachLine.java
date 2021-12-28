import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".

        Path filePath = Paths.get("new-file.txt");

        for(String line : readFile(filePath)){
            System.out.println(line);
        }

    }

    private static List<String> readFile(Path inputPath){
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(inputPath);
        }catch (IOException e){
            System.err.println("Unable to read file: my-file.txt");
        }
        return lines;
    }
}