package com.example.hellodiproject.color;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service
//@Primary
public class RedColor implements MyColor {

    public void printColor(){
        System.out.println("\033[0;31m" + "It is red in color..." + "\033[0m");
    }

}
