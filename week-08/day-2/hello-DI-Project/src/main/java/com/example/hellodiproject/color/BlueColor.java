package com.example.hellodiproject.color;

import org.springframework.stereotype.Service;

@Service
//@Primary
public class BlueColor implements MyColor {

    public void printColor(){
        System.out.println("\033[0;34m" + "It is blue in color..." + "\033[0m");
    }

}