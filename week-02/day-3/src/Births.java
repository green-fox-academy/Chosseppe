import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Births {
    public static void main(String[] args) throws IOException {
        // Create a function that
        // - takes the name of a CSV file as a parameter,
        //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
        // - and returns the year when the most births happened.
        //   - if there were multiple years with the same number of births then return any of them

        // You can find such a CSV file in this directory named births.csv
        // If you pass "births.csv" to your function, the result should be either 2006 or 2016

        births("births.csv");
    }

    private static void births(String inputString) throws IOException {
        String highest = null;
        String highest2 = null;
        int highestNum = 0;
        Map<String, Integer> dateRatios = new HashMap<>();
        Path filePath = Paths.get("src/" + inputString);
        List<String> fileList = new ArrayList<>(Files.readAllLines(filePath));
        for(String line  : fileList){
            String[] words = line.split(";");
            String[] datum = Arrays.asList(words).get(1).split("-");
            String year = Arrays.asList(datum).get(0);
            if(!dateRatios.containsKey(year)){
                dateRatios.put(year, 1);
            }else{
                dateRatios.replace(year, dateRatios.get(year) + 1);
            }

        }

        for(String key : dateRatios.keySet()){
            if(dateRatios.get(key) > highestNum){
                highestNum = dateRatios.get(key);
                highest = key;
            }
        }
        for(String key : dateRatios.keySet()){
            if(dateRatios.get(key) == highestNum && highest != key){
                highest2 = key;
            }
        }
        System.out.println(highest);
        System.out.println(highest2);
    }
}
