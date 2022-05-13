package com.greenfoxaccademy.programmerfoxclub.models;

import lombok.Data;

import java.util.List;

@Data
public class Fox {

    String name;
    List<String> food;
    List<String> tricks;

    public Fox(String name, List<String> food, List<String> tricks) {
        this.name = name;
        this.food = food;
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
