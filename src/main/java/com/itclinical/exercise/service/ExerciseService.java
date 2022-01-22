package com.itclinical.exercise.service;

import java.util.LinkedHashMap;
import java.util.Map;

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

        for (int i = n - 1; i < length; i += n) {
            ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public String getUpperOrSymbol(String input, int n) {
        int length = input.length();
        char ch;
        StringBuilder result = new StringBuilder();

        if (n < 1) {
            return "";
        }

        for (int i = n - 1; i < length; i += n) {
            ch = input.charAt(i);
            if (Character.isUpperCase(ch) || Character.isDigit(ch) || isSpecialChar(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public boolean isSpecialChar(char ch) {
        return !Character.isLetter(ch) && !Character.isDigit(ch);
    }

    public String getUpperPrint(String input, int n) {
        int length = input.length();
        char ch;
        StringBuilder result = new StringBuilder();

        if (n < 1) {
            return "";
        }

        for (int i = n - 1; i < length; i += n) {
            ch = input.charAt(i);
            if (Character.isUpperCase(ch) || Character.isDigit(ch) || isSpecialChar(ch)) {
                result.append(ch);
            }
        }

        printCount(result.toString());

        return result.toString();
    }

    public void printCount(String input) {
        int length = input.length();
        char ch;
        Map<Character, Integer> countChar = new LinkedHashMap<>();

        for (int i = 0; i < length; i++) {
            ch = input.charAt(i);
            countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> charCount : countChar.entrySet()) {
            System.out.println(charCount.getKey() + " = " + charCount.getValue());
        }
    }
}
