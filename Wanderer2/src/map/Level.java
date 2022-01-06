package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level {


    List<List<Object>> level;

    public Level() {

        level= new ArrayList<>();
        List<Object> x0 = Arrays.asList(0, 0, 'X', 1, 0, 1, 0, 0, 0, 0);
        level.add(x0);
        List<Object> x1 = Arrays.asList(0, 0, 0, 1, 0, 1, 0, 1, 1, 0);
        level.add(x1);
        List<Object> x2 = Arrays.asList(0, 1, 1, 1, 0, 1, 0, 1, 1, 0);
        level.add(x2);
        List<Object> x3 = Arrays.asList(0, 0, 0, 0, 0, 1, 0, 0, 0, 0);
        level.add(x3);
        List<Object> x4 = Arrays.asList(1, 1, 1, 1, 0, 1, 1, 1, 1, 0);
        level.add(x4);
        List<Object> x5 = Arrays.asList('S', 1, 'S', 1, 0, 0, 0, 0, 1, 0);
        level.add(x5);
        List<Object> x6 = Arrays.asList(0, 1, 0, 1, 0, 1, 1, 0, 1, 0);
        level.add(x6);
        List<Object> x7 = Arrays.asList(0, 0, 0, 0, 0, 1, 1, 0, 1, 0);
        level.add(x7);
        List<Object> x8 = Arrays.asList(0, 1, 1, 1, 0, 0, 0, 0, 1, 0);
        level.add(x8);
        List<Object> x9 = Arrays.asList(0, 0, 'B', 1, 0, 1, 1, 'S', 1, 0);
        level.add(x9);

    }

    public List<Object> get(int number) {
        List<Object> row = level.get(number);
        return row;
    }

    public Object gets(List<Object> row , int number){
        Object object = row.get(number);
        return object;
    }
}
