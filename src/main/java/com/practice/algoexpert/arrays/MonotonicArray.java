package com.practice.algoexpert.arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        boolean isNonDe = true;
        boolean isNonIn = true;
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] > array[i-1])
                isNonDe = false;
            if(array[i] < array[i-1])
                isNonIn = false;
        }
        return isNonDe || isNonIn;
    }
}
