package com.practice.algoexpert;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class IsPalindromeTest {

    @Test
    public void test1(){
        boolean isPalindrome = PalindromeCheck.isPalindrome("abbbba");
        assertTrue(isPalindrome);
    }

    @Test
    public void test2(){
        boolean isPalindrome = PalindromeCheck.isPalindrome("abbba");
        assertTrue(isPalindrome);
    }

    @Test
    public void test3(){
        boolean isPalindrome = PalindromeCheck.isPalindrome("");
        assertTrue(isPalindrome);
    }

    @Test
    public void test4(){
        boolean isPalindrome = PalindromeCheck.isPalindrome("alskd");
        assertFalse(isPalindrome);
    }

}
