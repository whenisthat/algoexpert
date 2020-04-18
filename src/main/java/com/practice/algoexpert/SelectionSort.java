package com.practice.algoexpert;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        // Write your code here.
        for(int i = 0 ; i < array.length ; i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = i ; j < array.length ; j++){
                if(min > array[j]){
                    min = array[j];
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIdx] = temp;

        }
        return array;
    }
}
