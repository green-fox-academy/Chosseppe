package com.greenfoxaccademy.programmerfoxclub.models;

import lombok.Data;
import java.util.List;

import static java.util.Arrays.*;

@Data
public class Fox {

    String name;
    List<String> food;
    List<String> tricks;

    public Fox(String name, String meal, String drink, List<String> tricks) {
        this.name = name;
        this.food.add(meal);
        this.food.add(drink);

        this.tricks = tricks;
    }

    public Fox(){}

    public String field(List<String> inputList) {
        StringBuilder outputString = new StringBuilder("");
        for(int n = 0; n < inputList.size(); n++){
            if(n < inputList.size() - 1){
                outputString.append(inputList.get(n));
                outputString.append(" and ");
            }else {
                outputString.append(inputList.get(n));
            }
        }
        return outputString.toString();
    }
}
