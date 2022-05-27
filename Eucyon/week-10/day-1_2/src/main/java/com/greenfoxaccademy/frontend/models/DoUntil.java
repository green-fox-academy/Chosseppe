package com.greenfoxaccademy.frontend.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DoUntil {

    private Integer until;
    private String operation;

    public DoUntil(int until, String operation){
        this.operation = operation;
        this.until = until;
    }

    public DoUntil(){}

    public Integer sum(int input) {
        int result = 0;
        for(int i = 0; i <= input; i++) {
            result += i;
        }
        return result;
    }

    public Integer factor(int input){
        int result = 0;
        for(int i = 0; i <= input; i++){
            if(i == 1){
                result = i;
            }else if(i > 1){
                result *= i;
            }
        }
        return result;
    }

    public Integer operationResult(){
        int result = 0;
        if(operation.equals("sum")){
            result = sum(until);
        }else if(operation.equals("factor")){
            result = factor(until);
        }
        return result;
    }

}
