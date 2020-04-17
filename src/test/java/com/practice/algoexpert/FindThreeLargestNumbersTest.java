package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindThreeLargestNumbersTest {

    @Test
    public void test1(){
        int[] array = {55,7,8};
        int[] result = FindThreeLargestNumbers.findThreeLargestNumbers(array);
        assertTrue(result[0]== 7);
        assertTrue(result[1]== 8);
        assertTrue(result[2]== 55);
    }

    @Test
    public void test2(){
        int[] array = {55,7,8,34,6,79,32,11,45};
        int[] result = FindThreeLargestNumbers.findThreeLargestNumbers(array);
        assertTrue(result[0]== 45);
        assertTrue(result[1]== 55);
        assertTrue(result[2]== 79);
    }

    @Test
    public void test3(){
        int[] array = {-55,-7,-8,-34,-6,-79,-32,-11,-45};
        int[] result = FindThreeLargestNumbers.findThreeLargestNumbers(array);
        assertTrue(result[0] == -8);
        assertTrue(result[1] == -7);
        assertTrue(result[2] == -6);
    }
}
