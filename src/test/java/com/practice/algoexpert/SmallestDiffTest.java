package com.practice.algoexpert;

import com.practice.algoexpert.arrays.SmallestDifference;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmallestDiffTest {

    @Test
    public void test1(){
        int[] arrayOne = {-1,5,10,20,28,3};
        int[] arrayTwo = {26,134,135,15,17};
        int[] result = SmallestDifference.smallestDifference(arrayOne,arrayTwo);
        assertTrue(result[0] == 28);
        assertTrue(result[1] == 26);
    }

    @Test
    public void test2(){
        int[] arrayOne = {1};
        int[] arrayTwo = {26,134,135,15,17};
        int[] result = SmallestDifference.smallestDifference(arrayOne,arrayTwo);
        assertTrue(result[0] == 1);
        assertTrue(result[1] == 15);
    }

    @Test
    public void test3(){
        int[] arrayOne = {1,135,135};
        int[] arrayTwo = {26,134,135,15,17};
        int[] result = SmallestDifference.smallestDifference(arrayOne,arrayTwo);
        assertTrue(result[0] == 135);
        assertTrue(result[1] == 135);
    }

    @Test
    public void test4(){
        int[] arrayOne = {};
        int[] arrayTwo = {26,134,135,15,17};
        int[] result = SmallestDifference.smallestDifference(arrayOne,arrayTwo);
        assertTrue(result.length == 2);
        assertTrue(result[0] == -1);
        assertTrue(result[1] == -1);

    }
}
