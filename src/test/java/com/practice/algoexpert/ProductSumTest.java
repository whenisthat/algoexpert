package com.practice.algoexpert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class ProductSumTest {

    @Test
    public void test1(){
        List<Object> source = new ArrayList<>(Arrays.asList(5,2,
            new ArrayList<>(Arrays.asList(7,-1)),3,new ArrayList<Object>(Arrays.asList(6,new ArrayList<Object>(Arrays.asList(-13,8)),4))));
        int sum = ProductSum.productSum(source);
        assertTrue(sum == 12);
    }

    @Test
    public void test2(){
        List<Object> source = new ArrayList<>(Arrays.asList(5,2,2,8,3,4,0));
        int sum = ProductSum.productSum(source);
        assertTrue(sum == 24);
    }

    @Test
    public void test3(){
        List<Object> source = new ArrayList<>(Arrays.asList(5,2,
            new ArrayList<>(Arrays.asList(7,-1)),3,
            new ArrayList<Object>(Arrays.asList(6,
                new ArrayList<Object>(Arrays.asList(0,8)),4))));
        int sum = ProductSum.productSum(source);
        assertTrue(sum == 90);
    }
}
