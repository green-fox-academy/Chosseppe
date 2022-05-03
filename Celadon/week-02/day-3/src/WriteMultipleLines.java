import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // - The path parameter should be a string that describes the location (path & name)
        //    of the file you wish to modify.
        // - The word parameter should also be a string that will be written to the file as individual lines.
        // - The number parameter should describe how many lines the file should have.

        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'.
        // The function should not raise any errors if it could not write the file.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which word do you want to write to file? :");
        String multiplied = scanner.nextLine();

        System.out.println("How many times do you want to multiply word? :");
        Integer multiplier = scanner.nextInt();

        System.out.println("What is the name for file to store multiplied word?(.txt is filled automatically) :");
        String name = scanner.next();

        Path filePath = Paths.get(name + ".txt");

        writeMultipleLines(multiplied, multiplier, filePath);

    }

    private static void writeMultipleLines(String multipliedWord, Integer multiplier, Path relativePathToFile){
        List<String> tempFile = new ArrayList<>();
        for(int i = 0; i < multiplier; i++){
            tempFile.add(multipliedWord);
        }
        try {
            Files.write(relativePathToFile, tempFile);
        }catch (IOException e){
            System.out.println();
        }
    }
}
