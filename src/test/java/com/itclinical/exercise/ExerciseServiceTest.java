package com.itclinical.exercise;

import com.itclinical.exercise.service.ExerciseService;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseServiceTest {

    @Autowired
    private ExerciseService exerciseService;
    
    @Test
    public void testGetUpperWithN1() {
        String result = exerciseService.getUpper("ITCLiNicAl", 1);
        Assertions.assertEquals("ITCLNA", result);
    }

    @Test
    public void testGetUpperWithN2() {
        String result = exerciseService.getUpper("ITCLiNicAl", 2);
        Assertions.assertEquals("TLN", result);
    }

    @Test
    public void testGetUpperWithN3() {
        String result = exerciseService.getUpper("ITCLiNicAl", 3);
        Assertions.assertEquals("CNA", result);
    }

    @Test
    public void testGetUpperWithN100() {
        String result = exerciseService.getUpper("ITCLiNicAl", 100);
        Assertions.assertEquals("", result);
    }

    @Test
    public void testGetUpperWithNMinus1() {
        String result = exerciseService.getUpper("ITCLiNicAl", -1);
        Assertions.assertEquals("", result);
    }

    @Test
    public void testGetUpperWithN0() {
        String result = exerciseService.getUpper("ITCLiNicAl", 0);
        Assertions.assertEquals("", result);
    }

    @Test
    public void testGetUpperWithEmptyInput() {
        String result = exerciseService.getUpper("", 1);
        Assertions.assertEquals("", result);
    }

    @Test
    public void testGetUpperWithSymbols() {
        String result = exerciseService.getUpper("123!@#X", 1);
        Assertions.assertEquals("X", result);
    }

    // Optional Task 1
    @Test
    public void testGetUpperOrSymbolWithN1() {
        String result = exerciseService.getUpperOrSymbol("!tCL1Nical", 1);
        Assertions.assertEquals("!CL1N", result);
    }

    @Test
    public void testIsSpecialCharWithSymbol() {
        boolean result = exerciseService.isSpecialChar('!');
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsSpecialCharWithSymbolQuestion() {
        boolean result = exerciseService.isSpecialChar('?');
        Assertions.assertTrue(result);
    }
}
