package com.practice.algoexpert;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromePartitioningMinCutsTest {

    @Test
    public void test1(){
        String source = "";
        int mincuts = PalindromePartitioningMinCuts.palindromePartitioningMinCuts(source);
        assertTrue(mincuts == 0);
    }

    @Test
    public void test2(){
        String source = "ab";
        int mincuts = PalindromePartitioningMinCuts.palindromePartitioningMinCuts(source);
        assertTrue(mincuts == 1);
    }

    @Test
    public void test3(){
        String source = "aba";
        int mincuts = PalindromePartitioningMinCuts.palindromePartitioningMinCuts(source);
        assertTrue(mincuts == 0);
    }

    @Test
    public void test4(){
        String source = "abb";
        int mincuts = PalindromePartitioningMinCuts.palindromePartitioningMinCuts(source);
        assertTrue(mincuts == 0);
    }
}
