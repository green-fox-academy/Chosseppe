import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful

        System.out.println("Write path to file which you want to copy with file name (absolut or relative):");
        String inputPath = scanner.next();

        System.out.println("Write path of destination with file name where you want to copy:");
        String copyPath = scanner.next();

        copyFile(readFile(inputPath), copyPath);

        System.out.println(copyFile(readFile(inputPath), copyPath));

    }

    private static List<String> readFile(String inputPath){
        Path filePath = Paths.get(inputPath);
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(filePath);
        }catch (IOException e){
            System.err.println("Unable to read file on path: " + inputPath);
        }
        return lines;
    }

    private static Boolean copyFile(List<String> inputList, String outputPath){
        Path filePath = Paths.get(outputPath);

        try {
            Files.write(filePath, inputList);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
