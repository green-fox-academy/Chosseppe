import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) throws IOException {
        // Create a method called decryptDoubled() that takes a filename as string as a parameter
        // and it can decrypt the duplicated-chars.txt file
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The result should be saved in the output.txt file

        readFile("Duplicated.txt");
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

    /*private static void decryptDoubled(List<String> inputList) throws IOException {


        List<String> output = new ArrayList<>();
        String temp;
        for(String line : inputList){
            System.out.println(line);
        }
    }

     */
}