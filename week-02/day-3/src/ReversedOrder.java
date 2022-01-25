import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts reversed-order.txt

        Path filePath = Paths.get("src/reversed-order.txt");
        List<String> reversedOrder = new ArrayList<>(Files.readAllLines(filePath));

        decryptReversedOrder(reversedOrder);
    }

    private static void decryptReversedOrder(List<String> inputList) throws IOException{
        List<String> output = new ArrayList<>();
        for(int i = inputList.size() - 1; i >= 0; i--){
            output.add(inputList.get(i));
            System.out.println(inputList.get(i));
        }
            Files.write(Path.of("src/decrypted-reversed-order.txt"), output);
    }
}