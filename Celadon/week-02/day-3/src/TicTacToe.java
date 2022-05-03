import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file's content

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String inputString) throws IOException {
        Path filePath = Paths.get("src/" + inputString);
        List<String> file = new ArrayList<>(Files.readAllLines(filePath));
        List<Character> temp = new ArrayList<>();
        List<List<Character>> inputMatrix = new ArrayList<>();
        for(String line : file){
            for(int i = 0; i < line.length(); i++) {
                temp.add(line.charAt(i));
                if(temp.size() == line.length()){
                    inputMatrix.add(temp);
                    temp = new ArrayList<>();
                }
            }

        }

        int counterO;
        int counterO2;
        int counterO3 = 0;
        int counterO4 = 0;
        int counterX;
        int counterX2;
        int counterX3 = 0;
        int counterX4 = 0;

        for(int i = 0; i < inputMatrix.size(); i++){
            counterO = 0;
            counterX = 0;
            for(int j = 0; j < inputMatrix.get(i).size(); j++){
                if('O' == inputMatrix.get(i).get(j)){
                    counterO++;
                    //if(counterO == 3){
                    //    return "O";
                    //}
                }else{
                    counterX++;
                    //if(counterX == 3){
                    //    return "X";
                    }

            }

            //System.out.println("Counted O2: " + counterO2);
            //System.out.println("Counted X2: " + counterX2);
        }

        for(int i = 0; i < inputMatrix.size(); i++){
            counterO2 = 0;
            counterX2 = 0;
            for(int j = 0; j < inputMatrix.get(i).size(); j++){
                if('O' == inputMatrix.get(j).get(i)){
                    counterO2++;
                    if(counterO2 == 3){
                        return "O";
                    }
                }else{
                    counterX2++;
                    if(counterX2 == 3) {
                        return "X";
                    }
                }

            }

        }
        for(int i = 0; i < inputMatrix.size(); i++) {
            for (int j = 0; j < inputMatrix.get(i).size(); j++) {
                if (i == j) {
                    if ('O' == inputMatrix.get(i).get(j)) {
                        counterO3++;
                        if(counterO3 == 3){
                            return "O";
                        }
                    } else {
                        counterX3++;
                        if(counterX3 == 3) {
                            return "X";
                        }
                    }
                }
            }
        }
        for(int i = 0; i < inputMatrix.size(); i++) {
            for( int j = inputMatrix.size() - 1; j >= 0; j--){
                if(i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0){
                    if ('O' == inputMatrix.get(i).get(j)) {
                        counterO4++;
                        if(counterO4 == 3){
                            return "O";
                        }
                    } else {
                        counterX4++;
                        if(counterX4 == 3) {
                            return "X";
                        }
                    }
                }
            }
        }


        return "Draw";
    }
}