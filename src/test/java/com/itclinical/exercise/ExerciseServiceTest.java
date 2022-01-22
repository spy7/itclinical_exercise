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
}
