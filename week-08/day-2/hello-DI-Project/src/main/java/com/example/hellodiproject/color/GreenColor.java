package com.example.hellodiproject.color;

import org.springframework.stereotype.Service;

//@Service
//@Primary
public class GreenColor implements MyColor {

    public void printColor(){
        System.out.println("\033[0;32m" + "It is green in color..." + "\033[0m");
    }

}
