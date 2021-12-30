import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) throws IOException {
        // Read all data from 'log.txt'
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses
        // Write a function that returns the GET / POST request ratio

        Path filePath = Paths.get("src/log.txt");
        List<String> inputFile = Files.readAllLines(filePath);

        System.out.println(uniqueIP(inputFile));

        System.out.println(requestRatio(inputFile));
    }

    private static List<String> uniqueIP(List<String> inputList){
        List<String> IPList = new ArrayList<>();
        int counter;

        for(String line : inputList){
            counter = 0;
            for(String address : line.split("  ")) {
                counter ++;
                if(counter == 3) {
                    if(!IPList.contains(address)){
                        IPList.add(address);
                    }
                }
            }
        }
        return IPList;
    }

    private static String  requestRatio(List<String> inputList){
        String output;
        int countGet = 0;
        int countPost = 0;
        int counter;

        for(String line : inputList){
            counter = 0;
            for(String ratio : line.split("  ")) {
                counter ++;
                if(counter == 4) {
                    if(ratio.contains("POST")){
                        countPost++;
                    }else{
                        countGet++;
                    }
                }
            }
        }
        output = "Post: " + countPost + "/ GET: " + countGet;


        return output;
    }
}
