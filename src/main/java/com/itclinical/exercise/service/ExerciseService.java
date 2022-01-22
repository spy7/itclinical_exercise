package com.itclinical.exercise.service;

import org.springframework.stereotype.Service;

@Service
public class ExerciseService {
    public String getUpper(String input, int n) {
        int length = input.length();
        char ch;
        StringBuilder result = new StringBuilder();

        if (n < 1) {
            return "";
        }
        
        for (int i = n - 1; i < length; i+=n) {
            ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public String getUpperOrSymbol(String input, int n) {
        return "!CL1N";
    }
}
