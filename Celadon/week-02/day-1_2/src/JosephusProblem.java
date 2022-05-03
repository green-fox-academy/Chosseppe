import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players:");
        int numberOfPlayers = scanner.nextInt();

        System.out.printf(
                "The winning seat is %d%n", getWinningSeat(numberOfPlayers)
        );
    }
    private static Integer getWinningSeat(int inputNumber){
        Integer output;
        int count = 0;
        List<Integer> iterativeList = new ArrayList<>();
        List<Integer> killedEachSecond = new ArrayList<>();


        for(int i = 1; i <= inputNumber; i++){
            iterativeList.add(i);
            killedEachSecond.add(i);
        }
        while(killedEachSecond.size() != 1) {
            for (Integer integer : iterativeList) {
                count++;
                if (count % 2 == 0) {
                    for (int j = 0; j < killedEachSecond.size(); j++) {
                        if (integer.equals(killedEachSecond.get(j))) {
                            killedEachSecond.remove(j);
                        }

                    }
                }
            }
            iterativeList = new ArrayList<>(killedEachSecond);
        }
        output = killedEachSecond.get(0);
        return output;
    }
}