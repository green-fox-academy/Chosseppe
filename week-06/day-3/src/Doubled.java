import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args){
        // Create a method called decryptDoubled() that takes a filename as string as a parameter
        // and it can decrypt the duplicated-chars.txt file
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The result should be saved in the output.txt file

        decryptDoubled(readFile("src/duplicated-chars.txt"));
    }

    private static List<String> readFile(String inputPath){
        Path filePath = Paths.get(inputPath);
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(filePath);
        }catch (IOException e){
            System.err.println("File not found");
        }
        return lines;
    }

    private static void decryptDoubled(List<String> inputList){


        List<String> output = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for(String line : inputList){
            new StringBuilder(line);
            for(int i = 1; i <= line.length(); i++){
                if(i % 2 == 0){
                    temp.append(line.charAt(i - 1));
                }
            }
            output.add(temp.toString());
            temp = new StringBuilder();
        }
        try {
            Files.write(Path.of("src/output.txt"), output);
        }catch (IOException e){
            System.out.println("File not saved");
        }
    }


}