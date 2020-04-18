package com.practice.algoexpert;

import com.practice.algoexpert.arrays.MonotonicArray;
import org.junit.Test;
import static org.junit.Assert.*;

public class MonotonicArrayTest {

    @Test
    public void test1(){
        int[] source = {1,2,0};
        boolean isMontonic = MonotonicArray.isMonotonic(source);
        assertFalse(isMontonic);
    }

    @Test
    public void test2(){
        int[] source = {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};
        boolean isMontonic = MonotonicArray.isMonotonic(source);
        assertTrue(isMontonic);
    }

    @Test
    public void test3(){
        int[] source = {-1,-5};
        boolean isMontonic = MonotonicArray.isMonotonic(source);
        assertTrue(isMontonic);
    }

    @Test
    public void test4(){
        int[] source = {-5};
        boolean isMontonic = MonotonicArray.isMonotonic(source);
        assertTrue(isMontonic);
    }

    @Test
    public void test5(){
        int[] source = {-5,6,4};
        boolean isMontonic = MonotonicArray.isMonotonic(source);
        assertFalse(isMontonic);
    }
}
