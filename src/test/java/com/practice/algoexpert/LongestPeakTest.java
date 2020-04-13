package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class LongestPeakTest {

    @Test
    public void test1(){
        int[] source = {1,2,3,3,4,0,10};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 3);
    }

    @Test
    public void test2(){
        int[] source = {1,2,3,3,4,0,10,6};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 3);
    }

    @Test
    public void test3(){
        int[] source = {1,2,3,3,4,0,10,6,5};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 4);
    }

    @Test
    public void test4(){
        int[] source = {1,2,3,3,4,0,10,6,5,-1,-3};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 6);
    }

    @Test
    public void test5(){
        int[] source = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 6);
    }

    @Test
    public void test6(){
        int[] source = {5,4,3,2,1,2,10,12};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 0);
    }

    @Test
    public void test7(){
        int[] source = {};
        int height = LongestPeak.longestPeak(source);
        assertTrue(height == 0);
    }
}
