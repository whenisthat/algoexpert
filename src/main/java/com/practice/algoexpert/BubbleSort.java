package com.practice.algoexpert;

public class BubbleSort {

    public static int[] bubbleSort(int[] source){
        for(int i = 0 ; i < source.length ; i++){
            for(int j = i+1; j < source.length ; j++){
                if(source[i] > source[j]){
                    int temp = source[i];
                    source[i] = source[j];
                    source[j] = temp;
                }
            }
        }
        return source;
    }
}
