package com.practice.algoexpert;

import com.practice.algoexpert.arrays.ThreeNumberSum;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ThreeNumberSumTest {

    @Test
    public void test1(){
        int[] input = {12,3,1,2,-6,5,-8,6};
        List<Integer[]> result = ThreeNumberSum.threeNumberSum(input,0);
        assertTrue(result.size() == 3);
        Integer[] res1 = result.get(0);
        assertTrue(res1[0] == -8);
        assertTrue(res1[1] == 2);
        assertTrue(res1[2] == 6);

        res1 = result.get(1);
        assertTrue(res1[0] == -8);
        assertTrue(res1[1] == 3);
        assertTrue(res1[2] == 5);

        res1 = result.get(2);
        assertTrue(res1[0] == -6);
        assertTrue(res1[1] == 1);
        assertTrue(res1[2] == 5);
    }


    @Test
    public void test2(){
        int[] input = {12,3,1,2,-6,5,-8,6,0};
        List<Integer[]> result = ThreeNumberSum.threeNumberSum(input,15);
        assertTrue(result.size() == 2);
        Integer[] res1 = result.get(0);
        assertTrue(res1[0] == 0);
        assertTrue(res1[1] == 3);
        assertTrue(res1[2] == 12);

        res1 = result.get(1);
        assertTrue(res1[0] == 1);
        assertTrue(res1[1] == 2);
        assertTrue(res1[2] == 12);

    }
}
