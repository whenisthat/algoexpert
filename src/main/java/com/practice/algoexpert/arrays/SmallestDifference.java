package com.practice.algoexpert.arrays;



import java.util.Arrays;

/*  Write a function that takes in two non-empty arrays of integers, finds the
      pair of numbers (one from each array) whose absolute difference is closest to
      zero, and returns an array containing these two numbers, with the number from
      the first array in the first position.*/
public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo){
        int[] result = {-1,-1};
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int smallestDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < arrayOne.length ; i++){
            int j = 0 ;
            do{
                int temp = Math.abs(arrayOne[i]-arrayTwo[j]);
                if(temp < smallestDiff){
                    smallestDiff = temp;
                    result[0] = arrayOne[i];
                    result[1] = arrayTwo[j];
                }
                j++;
            }while(j < arrayTwo.length && arrayOne[i] >= arrayTwo[j] );
        }
        return result;
    }
}
