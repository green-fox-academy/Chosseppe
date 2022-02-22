package com.example.hellodiproject.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PrinterService {
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}
