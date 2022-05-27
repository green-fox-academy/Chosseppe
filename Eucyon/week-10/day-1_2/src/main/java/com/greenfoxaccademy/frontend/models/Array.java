package com.greenfoxaccademy.frontend.models;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Array {

    private String operation;
    private ArrayList<Integer> numbers;

    public Array(String operation, ArrayList<Integer> numbers) {
        this.operation = operation;
        this.numbers = numbers;
    }

    public Array() {
    }

    public Integer sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    public Integer multiplycation(ArrayList<Integer> numbers) {
        int result = 1;
        for (Integer number : numbers) {
            result *= number;
        }
        return result;
    }

    public ArrayList<Integer> doubling(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(number * 2);
        }
        return result;
    }

    public String result() {
        if (operation.equals("sum")) {
            return String.valueOf(sum(numbers));
        } else if (operation.equals("multiply")) {
            return String.valueOf(multiplycation(numbers));
        }else if (operation.equals("double")) {
            return String.valueOf(doubling(numbers));
        } else{
            return null;
        }
    }
}
