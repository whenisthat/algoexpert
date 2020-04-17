package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.*;

public class BInarySearchTest {

    @Test
    public void test1(){
        int[] source = {1,5,23,111};
        int index = BinarySearch.binarySearch(source,111);
        assertTrue(index == 3);

    }

    @Test
    public void test2(){
        int[] source = {1,5,23,111};
        int index = BinarySearch.binarySearch(source,231);
        assertTrue(index == -1);

    }

    @Test
    public void test3(){
        int[] source = {1,5,6,7,8,9,23,111};
        int index = BinarySearch.binarySearch(source,9);
        assertTrue(index == 5);

    }

    @Test
    public void test4(){
        int[] source = {1,5};
        int index = BinarySearch.binarySearch(source,4);
        assertTrue(index == -1);

    }

    @Test
    public void test5(){
        int[] source = {};
        int index = BinarySearch.binarySearch(source,4);
        assertTrue(index == -1);

    }
}
