package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class MaxSubSetSumNoAdjacentTest {

    @Test
    public void test1(){
        int[] source = {75,105,120,75,90,135};
        int result = MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(source);
        assertTrue(result == 330);
    }

    @Test
    public void test2(){
        int[] source = {75,105,120,75,90,135,85,190};
        int result = MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(source);
        assertTrue(result == 520);
    }


    @Test
    public void test3(){
        int[] source = {75,105};
        int result = MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(source);
        assertTrue(result == 105);
    }


    @Test
    public void test4(){
        int[] source = {75};
        int result = MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(source);
        assertTrue(result == 75);
    }
}
