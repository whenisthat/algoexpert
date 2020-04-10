package com.practice.algoexpert;

public class MaxSubsetSumNoAdjacent {

    public static int maxSubsetSumNoAdjacent(int[] source){
        int maxSum = 0;
        for(int i = 0 ; i < source.length ; i++){
            if(i < 2){
                maxSum = maxSum > source[i] ? maxSum : source[i];
                source[i] = maxSum;
                continue;
            }
            int temp = source[i] + source[i-2];
            if(temp > maxSum)
                maxSum = temp;
            source[i] = maxSum;
        }
        return maxSum;
    }
}
