package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoNumberSumTest {

    @Test
    public void test1(){
        int[] source = {3,7,6,5,4,9,7,5};
        int sum = 10;
        int[] result = TwoNumberSum.getTwoNumberSum(source,sum);
        assertEquals(result[0],0);
        assertEquals(result[1],1);
    }

    @Test
    public void test2(){
        int[] source = {3,7,6,5,4,9,7,5};
        int sum = 27;
        int[] result = TwoNumberSum.getTwoNumberSum(source,sum);
        assertTrue(result.length == 0);
    }


    @Test
    public void test3(){
        int[] source = {3,-7,6,5,-4,-9,-7,5};
        int sum = -16;
        int[] result = TwoNumberSum.getTwoNumberSum(source,sum);
        assertEquals(result[0],1);
        assertEquals(result[1],5);
    }
}
