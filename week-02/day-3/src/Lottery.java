import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

    public static void main(String[] args) throws IOException {
        // Create a method that find the 5 most common lottery numbers in lottery.csv

        System.out.println(lotteryNumbers("lottery.csv"));

    }

    private static List<String> lotteryNumbers(String inputString) throws IOException {
        List<String> mostCommonNumbers = new ArrayList<>();
        String keyX = null;
        Integer valueX = 0;
        Map<String, Integer> numberCounter = new HashMap<>();
        Path filePath = Paths.get("src/" + inputString);
        List<String> inputFile = Files.readAllLines(filePath);
        for(String fileString : inputFile){
            List<String> temp = List.of(fileString.split(" "));
            List<String> temp2 = List.of(temp.get(temp.size() - 1).split(";"));
            for(int i = 1; i < temp2.size(); i++){
                if(!numberCounter.containsKey(temp2.get(i))){
                    numberCounter.put(temp2.get(i), 1);
                }else{
                    numberCounter.replace(temp2.get(i), numberCounter.get(temp2.get(i)) + 1);
                }
            }
        }

        while (mostCommonNumbers.size() < 5){
            Map<String, Integer> tempNumberCounter = new HashMap<>(numberCounter);
            System.out.println(tempNumberCounter.size());
            for(String key : tempNumberCounter.keySet()) {
                if (valueX < numberCounter.get(key)) {
                    valueX = numberCounter.get(key);
                    keyX = key;
                }
            }
            mostCommonNumbers.add(keyX);
            numberCounter.remove(keyX, valueX);
            valueX = 0;
            keyX = null;

        }
        return mostCommonNumbers;
    }
}