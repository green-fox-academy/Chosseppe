import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        writeSingleLine("Joseph Michalicka");

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

    private static void writeSingleLine(String inputString){
        Path filePath = Paths.get("new-file.txt");
        List<String> lines = new ArrayList<>(readFile(filePath));
        lines.add(inputString);


        try {
            Files.write(filePath, lines);
            System.out.println("Done.");
        } catch (IOException e) {
            System.err.println("Uh-oh, could not write the file!");
        }
    }
}