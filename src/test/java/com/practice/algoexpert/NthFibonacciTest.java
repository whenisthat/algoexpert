package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.*;

public class NthFibonacciTest {

    @Test
    public void test1(){
        int nthFib = NthFibonacci.getNthFibonacci(5);
        assertTrue(nthFib == 3);
    }

    @Test
    public void test2(){
        int nthFib = NthFibonacci.getNthFibonacci(10);
        assertTrue(nthFib == 34);
    }


    @Test
    public void test3(){
        int nthFib = NthFibonacci.getNthFibonacci(0);
        assertTrue(nthFib == 0);
    }

    @Test
    public void test4(){
        int nthFib = NthFibonacci.getNthFibonacci(-1);
        assertTrue(nthFib == 0);
    }

    @Test
    public void test5(){
        int nthFib = NthFibonacci.getNthFibonacci(1);
        assertTrue(nthFib == 0);
    }

    @Test
    public void test6(){
        int nthFib = NthFibonacci.getNthFibonacci(2);
        assertTrue(nthFib == 1);
    }
}
