package com.greenfoxaccademy.programmerfoxclub.services;

import com.greenfoxaccademy.programmerfoxclub.models.Fox;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Service
public class FoxService {

    private List<Fox> foxes;

    public FoxService() {
        foxes = new ArrayList<>();
        Fox testfox = new Fox("Karol", "mouse", "water", Arrays.asList("HTML", "java") );
        foxes.add(testfox);
    }

    public boolean findName(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Fox postFox(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }
}