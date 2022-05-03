package com.example.hellodiproject.services;

import org.springframework.stereotype.Service;

@Service
public class SpellCheckerService {
    public SpellCheckerService() {
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}
