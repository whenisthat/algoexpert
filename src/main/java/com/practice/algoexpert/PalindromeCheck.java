package com.practice.algoexpert;

public class PalindromeCheck {

    public static boolean isPalindrome(String source){
        boolean isPalindrome = true;
        int i = 0 , j = source.length()-1;
        while(isPalindrome &&  i < j){
            if(source.charAt(i) != source.charAt(j) )
                isPalindrome = false;
            i++;
            j--;
        }
        return isPalindrome;
    }
}
