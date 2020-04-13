package com.practice.algoexpert;

public class LongestPeak {

    public static int longestPeak(int[] array){

        int longestPeak = 0;
        int startIndex = 0;
        boolean up = false;
        boolean down = false;
        for(int i = 1 ; i < array.length ; i++){
            startIndex = i-1;
           while(i < array.length && array[i] > array[i-1]){
               up = true;
               i++;
           }
           int k = i-1;
           while(up && k < array.length-1 && array[k] > array[k+1]){
               down = true;
               k++;
           }

           if(up && down) {
               longestPeak = Math.max(longestPeak,k-startIndex+1);
           }
           up = false;
           down = false;




        }
        return longestPeak;
    }
}
